package com.lti.prc.hospital_management_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.prc.hospital_management_app.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
