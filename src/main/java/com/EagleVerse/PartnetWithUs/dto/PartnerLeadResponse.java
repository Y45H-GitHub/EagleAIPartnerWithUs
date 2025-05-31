package com.EagleVerse.PartnetWithUs.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PartnerLeadResponse {
    private UUID id;
    private String status;
    private String createdAt;

    private String salonName;
    private String branchNumber;
    private String city;
    private String clientType;

    private String contactName;
    private String contactEmail;
    private String contactPhone;
    private String contactDesignation;

    private String businessType;

}
