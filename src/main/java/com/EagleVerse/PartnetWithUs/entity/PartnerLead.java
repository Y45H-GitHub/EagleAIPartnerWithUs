package com.EagleVerse.PartnetWithUs.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "partner_leads")
public class PartnerLead extends BaseEntity{
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private LeadStatus status=LeadStatus.NEW;

    @Column(nullable = false)
    private String source;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "salon_info_id", referencedColumnName = "id")
    private SalonInfo salonInfo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "primary_contact_id", referencedColumnName = "id")
    private PrimaryContact primaryContact;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "business_detail_id", referencedColumnName = "id")
    private BusinessDetail businessDetail;


}
