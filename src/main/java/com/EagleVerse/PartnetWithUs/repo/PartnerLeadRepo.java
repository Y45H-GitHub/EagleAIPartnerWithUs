package com.EagleVerse.PartnetWithUs.repo;

import com.EagleVerse.PartnetWithUs.entity.PartnerLead;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PartnerLeadRepo extends JpaRepository<PartnerLead, UUID> {
}
