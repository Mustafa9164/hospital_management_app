package com.lti.prc.hospital_management_app.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Branch {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int brachId;
	private String branchName;
	private int pincode;
	
	@OneToOne
	@JsonIgnore
	private Address address;
	
	@ManyToOne
	@JsonIgnore
	private Hospital hospital;

}
