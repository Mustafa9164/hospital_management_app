package com.lti.prc.hospital_management_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.prc.hospital_management_app.entities.AppointmentRecord;
import com.lti.prc.hospital_management_app.service.AppointmentService;
import com.lti.prc.hospital_management_app.util.ResponseStructure;

@RestController
@RequestMapping("/appointmentRecord")
public class AppointmentRecordController {
	
	@Autowired
	private AppointmentService appointmentService;
	
//	public ResponseEntity<ResponseStructure<AppointmentRecord>> saveAppointment(@Repository AppointmentRecord appointmentRecord){
//		return appointmentService.saveAppointment()
//	}


}
