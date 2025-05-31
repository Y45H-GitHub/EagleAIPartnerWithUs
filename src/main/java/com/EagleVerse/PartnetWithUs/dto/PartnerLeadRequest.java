package com.EagleVerse.PartnetWithUs.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;


@Data
public class PartnerLeadRequest {
    private String source;

    @NotBlank
    private String salonName;
    private String branchNumber;
    @NotBlank private String city;
    @NotNull private Integer avgMonthlyFootfall;
    @NotBlank private String clientType;

    @NotBlank private String contactName;
    @Email
    private String contactEmail;
    @Pattern(regexp = "\\d{10}", message = "Number must be 10 digits") private String contactPhone;
    private String contactDesignation;

    private String businessType;
    private String gstin;
}
