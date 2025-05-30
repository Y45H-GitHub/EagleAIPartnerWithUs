package com.EagleVerse.PartnetWithUs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "primary_contact")
public class PrimaryContact {
    private String fullName;
    private String email;
    private String phone;
    private String designation;
}
