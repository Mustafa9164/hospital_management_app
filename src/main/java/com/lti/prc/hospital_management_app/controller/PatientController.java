package com.lti.prc.hospital_management_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.prc.hospital_management_app.entities.Patient;
import com.lti.prc.hospital_management_app.service.PatientService;
import com.lti.prc.hospital_management_app.util.ResponseStructure;

@RestController
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@PostMapping("/save")
	public ResponseEntity<ResponseStructure<Patient>> savePatient(@RequestBody Patient patient){
		return patientService.savePatient(patient);
	}

}
