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
}
