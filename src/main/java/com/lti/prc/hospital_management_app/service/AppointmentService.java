package com.lti.prc.hospital_management_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.prc.hospital_management_app.dao.AppointmentDao;

@Service
public class AppointmentService {
	
	@Autowired
	private AppointmentDao appointmentDao;


}
