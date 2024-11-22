package com.lti.prc.hospital_management_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.lti.prc.hospital_management_app.entities.Hospital;
import com.lti.prc.hospital_management_app.service.HospitalService;
import com.lti.prc.hospital_management_app.util.ResponseStructure;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
	
	@Autowired
	private HospitalService hospitalService;
	
	@PostMapping("/save")
	public ResponseEntity<ResponseStructure<Hospital>> saveHospital(@RequestBody Hospital hospital){
		return hospitalService.saveHospital(hospital);
	}
	
	@GetMapping("/byId")
	public ResponseEntity<ResponseStructure<Hospital>> getHospitalById(@RequestParam int hospId){
		return hospitalService.getHospitalById(hospId);
	}
	@GetMapping("/findAll")
	public ResponseEntity<ResponseStructure<List<Hospital>>> getAllHospital(){
		return hospitalService.findAllHospital();
	}
	@DeleteMapping("/delete")
	public ResponseEntity<ResponseStructure<Boolean>> deleteHospital(@RequestParam int hospId){
		return hospitalService.deleteHopital(hospId);
	}
	@PutMapping("/update")
		public ResponseEntity<ResponseStructure<Hospital>> updateHospital(@RequestParam int hospId,@RequestBody Hospital hospital){
			return hospitalService.updateEmployee(hospId,hospital);
	}

}
