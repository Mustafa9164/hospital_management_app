package com.lti.prc.hospital_management_app.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class AppointmentRecord {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int arid;
	private int patientId;
	private int doctorId;
	
	
	@OneToOne
	@JsonIgnore
	private Prescription prescription;

}
