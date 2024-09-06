package com.salon.information.model;

import jakarta.persistence.*;
import lombok.Data;
@Data 
@Entity
@Table(name = "salon_info")

public class SalonInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private int vendor_id;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String website;

    @Column(name = "whatsapp_number", nullable = false)
    private String whatsAppNumber;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getWhatsAppNumber() {
		return whatsAppNumber;
	}

	public void setWhatsAppNumber(String whatsAppNumber) {
		this.whatsAppNumber = whatsAppNumber;
	}

	
}
