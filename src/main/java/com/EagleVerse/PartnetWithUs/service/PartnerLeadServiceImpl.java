package com.EagleVerse.PartnetWithUs.service;

import com.EagleVerse.PartnetWithUs.dto.PartnerLeadRequest;
import com.EagleVerse.PartnetWithUs.dto.PartnerLeadResponse;
import com.EagleVerse.PartnetWithUs.entity.*;
import com.EagleVerse.PartnetWithUs.repo.PartnerLeadRepo;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class PartnerLeadServiceImpl implements PartnerLeadService{

    final private PartnerLeadRepo partnerLeadRepo;

    @Override
    public PartnerLeadResponse createLead(PartnerLeadRequest request) {

        PartnerLead lead=new PartnerLead();
        lead.setSource(request.getSource());
        lead.setStatus(LeadStatus.NEW);

        SalonInfo salonInfo = new SalonInfo();
        salonInfo.setName(request.getSalonName());
        salonInfo.setBranchNumber(request.getBranchNumber());
        salonInfo.setCity(request.getCity());
        salonInfo.setAvgMonthlyFootfall(request.getAvgMonthlyFootfall());
        salonInfo.setClientType(request.getClientType());

        lead.setSalonInfo(salonInfo);

        PrimaryContact contact=new PrimaryContact();
        contact.setFullName(request.getContactName());
        contact.setEmail(request.getContactEmail());
        contact.setPhone(request.getContactPhone());
        contact.setDesignation(request.getContactDesignation());

        lead.setPrimaryContact(contact);

        BusinessDetail detail= new BusinessDetail();
        detail.setBusinessType(request.getBusinessType());
        detail.setGstin(request.getGstin());

        lead.setBusinessDetail(detail);

        PartnerLead saved = partnerLeadRepo.save(lead);
        return mapToResponse(saved);

    }

    @Override
    public List<PartnerLeadResponse> getAllLeads() {
        return partnerLeadRepo.findAll().stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public PartnerLeadResponse getLeadById(UUID id) {
        PartnerLead lead = partnerLeadRepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Lead not found with ID: " + id));
        return mapToResponse(lead);
    }

    @Override
    public PartnerLeadResponse updateStatus(UUID id, LeadStatus status) {
        PartnerLead lead = partnerLeadRepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Lead not found with ID: " + id));
        lead.setStatus(status);
        PartnerLead updated = partnerLeadRepo.save(lead);
        return mapToResponse(updated);
    }

    @Override
    public void deleteLead(UUID id) {
        if (!partnerLeadRepo.existsById(id)) {
            throw new EntityNotFoundException("Lead not found with ID: " + id);
        }
        partnerLeadRepo.deleteById(id);

    }

    public PartnerLeadResponse mapToResponse(PartnerLead lead) {
        return PartnerLeadResponse.builder()
                .id(lead.getId())
                .status(lead.getStatus().name())
                .createdAt(lead.getCreatedAt().toString()) // you can format this if needed
                .build();
    }

}

