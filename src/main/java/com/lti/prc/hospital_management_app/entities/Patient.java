package com.lti.prc.hospital_management_app.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patientId;
	private String name;
	private int age;
	private String gender;
	private String contact;
	
	@ManyToMany
	@JsonIgnore
	private List<Branch> branches;
	
	@OneToMany
	@JsonIgnore
	private List<AppointmentRecord> appointmentRecords;

}
