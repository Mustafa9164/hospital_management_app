package com.lti.prc.hospital_management_app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.prc.hospital_management_app.entities.Patient;
import com.lti.prc.hospital_management_app.repository.PatientRepo;

@Repository
public class PatientDao {
	
	@Autowired
	private PatientRepo patientRepo;

	public Patient savePatient(Patient patient) {
		return patientRepo.save(patient);
	}

}
