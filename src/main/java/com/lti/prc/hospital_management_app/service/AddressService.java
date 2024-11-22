package com.lti.prc.hospital_management_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.lti.prc.hospital_management_app.dao.AddressDao;
import com.lti.prc.hospital_management_app.entities.Address;
import com.lti.prc.hospital_management_app.util.ResponseStructure;

@Service
public class AddressService {
	
	@Autowired
	private AddressDao addressDao;

	public ResponseEntity<ResponseStructure<Address>> saveAddress(Address address) {
		ResponseStructure<Address> structure=new ResponseStructure<Address>();
		structure.setData(addressDao.saveAddress(address));
		structure.setMessage("adress saved");
		structure.setStatusCode(HttpStatus.CREATED.value());
		return new ResponseEntity<ResponseStructure<Address>>(structure,HttpStatus.CREATED);
	}

}
