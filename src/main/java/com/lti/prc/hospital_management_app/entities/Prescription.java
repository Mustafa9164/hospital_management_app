package com.lti.prc.hospital_management_app.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Prescription {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int prescriptionId;
	private int doctorId;
    private String dateIssued;          // Date the prescription was issued
    private String medicationDetails;   // Details of the prescribed medications

    @OneToMany
    @JsonIgnore
    List<MedicalItem> items;

}
