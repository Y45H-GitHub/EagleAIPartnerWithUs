package com.EagleVerse.PartnetWithUs.service;

import com.EagleVerse.PartnetWithUs.dto.PartnerLeadRequest;
import com.EagleVerse.PartnetWithUs.dto.PartnerLeadResponse;
import com.EagleVerse.PartnetWithUs.entity.LeadStatus;

import java.util.List;
import java.util.UUID;

public interface PartnerLeadService {
    PartnerLeadResponse createLead(PartnerLeadRequest request);
    List<PartnerLeadResponse> getAllLeads();
    PartnerLeadResponse getLeadById(UUID id);
    PartnerLeadResponse updateStatus(UUID id, LeadStatus status);
    void deleteLead(UUID id);
}
