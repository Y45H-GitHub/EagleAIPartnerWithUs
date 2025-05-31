package com.EagleVerse.PartnetWithUs.controller;

import com.EagleVerse.PartnetWithUs.dto.PartnerLeadRequest;
import com.EagleVerse.PartnetWithUs.dto.PartnerLeadResponse;
import com.EagleVerse.PartnetWithUs.entity.LeadStatus;
import com.EagleVerse.PartnetWithUs.service.PartnerLeadServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/leads")
@RequiredArgsConstructor
public class PartnerLeadController {

    private final PartnerLeadServiceImpl partnerLeadService;

    @PostMapping
    public ResponseEntity<PartnerLeadResponse> createLead(
            @Valid @RequestBody PartnerLeadRequest request) {
        return ResponseEntity.ok(partnerLeadService.createLead(request));
    }

    @GetMapping
    public ResponseEntity<List<PartnerLeadResponse>> getAllLeads() {
        return ResponseEntity.ok(partnerLeadService.getAllLeads());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PartnerLeadResponse> getLeadById(@PathVariable UUID id) {
        return ResponseEntity.ok(partnerLeadService.getLeadById(id));
    }

    @PatchMapping("/{id}/status")
    public ResponseEntity<PartnerLeadResponse> updateStatus(
            @PathVariable UUID id,
            @RequestParam LeadStatus status) {
        return ResponseEntity.ok(partnerLeadService.updateStatus(id, status));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLead(@PathVariable UUID id) {
        partnerLeadService.deleteLead(id);
        return ResponseEntity.noContent().build();
    }
}
