package com.EagleVerse.PartnetWithUs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "salon_info")
@Getter
@Setter
public class SalonInfo extends BaseEntity {
    private String name;
    private String branchNumber;
    private String city;
    private Integer avgMonthlyFootfall;
    private String clientType;
}
