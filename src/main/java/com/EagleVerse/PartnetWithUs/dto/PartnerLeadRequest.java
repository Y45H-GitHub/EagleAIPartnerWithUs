package com.EagleVerse.PartnetWithUs.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class PartnerLeadRequest {
    private String source;

    @NotBlank private String salonName;
    private String branchNumber;
    @NotBlank private String city;
    @NotBlank private Integer avgMonthlyFootfall;
    @NotBlank private String clientType;

    @NotBlank private String contactName;
    @Email private String contactEmail;
    @Pattern(regexp = "\\d{10}", message = "Number must be 10 digits") private String contactPhone;
    private String contactDesignation;

    private String businessType;
    private String gstin;
}
