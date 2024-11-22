package com.lti.prc.hospital_management_app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.prc.hospital_management_app.repository.AppointmentRecordRepo;

@Repository
public class AppointmentDao {
	
	@Autowired
	private AppointmentRecordRepo recordRepo;

}
