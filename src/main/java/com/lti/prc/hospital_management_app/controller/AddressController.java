package com.lti.prc.hospital_management_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.prc.hospital_management_app.entities.Address;
import com.lti.prc.hospital_management_app.service.AddressService;
import com.lti.prc.hospital_management_app.util.ResponseStructure;

@RestController
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@PostMapping("/saveaddress")
	public ResponseEntity<ResponseStructure<Address>> saveAddress(@RequestBody Address address){
		return addressService.saveAddress(address);
	}

}
