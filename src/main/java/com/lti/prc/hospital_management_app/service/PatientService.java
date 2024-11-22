package com.lti.prc.hospital_management_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.lti.prc.hospital_management_app.dao.PatientDao;
import com.lti.prc.hospital_management_app.entities.Hospital;
import com.lti.prc.hospital_management_app.entities.Patient;
import com.lti.prc.hospital_management_app.util.ResponseStructure;

@Service
public class PatientService {
	
	@Autowired
	private PatientDao patientDao;

	public ResponseEntity<ResponseStructure<Patient>> savePatient(Patient patient) {
		Patient savePatient = patientDao.savePatient(patient);
		ResponseStructure<Patient> structure=new ResponseStructure<Patient>();
		structure.setData(savePatient);
		structure.setMessage("Patient saved");
		structure.setStatusCode(HttpStatus.CREATED.value());
		return new ResponseEntity<ResponseStructure<Patient>>(structure,HttpStatus.CREATED);
	}

}
