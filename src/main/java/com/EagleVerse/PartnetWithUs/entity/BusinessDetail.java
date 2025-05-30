package com.EagleVerse.PartnetWithUs.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "business_detail")
@Getter
@Setter
public class BusinessDetail extends BaseEntity {
    private String businessType;
    private String gstin;
}
