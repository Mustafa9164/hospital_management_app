package com.lti.prc.hospital_management_app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.prc.hospital_management_app.entities.Hospital;
import com.lti.prc.hospital_management_app.repository.HospitalRepository;

@Repository
public class HospitalDao {
	
	@Autowired
	private HospitalRepository repository;

	public Hospital saveHospital(Hospital hospital) {
		return repository.save(hospital);
	}

	public Hospital getHospitalById(int hospId) {
		Optional<Hospital> optional = repository.findById(hospId);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	public List<Hospital> getAllHospitals() {
		return repository.findAll();
	}

	public boolean deleteHospital(int hospId) {
		Optional<Hospital> hospital = repository.findById(hospId);
		if(hospital.isPresent()) {
			 repository.delete(hospital.get());
			 return true;
		}else {
			return false;
		}
	}

	public Hospital updateHospital(int hospId, Hospital hospital) {
		Optional<Hospital> optional = repository.findById(hospId);
		if(optional.isPresent()) {
			hospital.setHospitalId(hospId);
			return repository.save(hospital);
		}
		return null;
	}
	
	public Hospital findById(int hospId) {
		Optional<Hospital> optional = repository.findById(hospId);
		return optional.isPresent()?optional.get():null;
	}
	
	

}
