package com.lti.prc.hospital_management_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.prc.hospital_management_app.entities.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

}
