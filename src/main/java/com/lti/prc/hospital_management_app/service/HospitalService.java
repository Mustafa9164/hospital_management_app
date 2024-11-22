package com.lti.prc.hospital_management_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.lti.prc.hospital_management_app.dao.HospitalDao;
import com.lti.prc.hospital_management_app.entities.Hospital;
import com.lti.prc.hospital_management_app.util.ResponseStructure;

@Service
public class HospitalService {
	
	@Autowired
	private HospitalDao hospitalDao;

	public ResponseEntity<ResponseStructure<Hospital>> saveHospital(Hospital hospital) {
		Hospital saveHospital = hospitalDao.saveHospital(hospital);
		ResponseStructure<Hospital> structure=new ResponseStructure<Hospital>();
		structure.setData(saveHospital);
		structure.setMessage("hospital saved");
		structure.setStatusCode(HttpStatus.CREATED.value());
		return new ResponseEntity<ResponseStructure<Hospital>>(structure,HttpStatus.CREATED);
	}

	public ResponseEntity<ResponseStructure<Hospital>> getHospitalById(int hospId) {
		Hospital getHospital = hospitalDao.getHospitalById(hospId);
		ResponseStructure<Hospital> structure=new ResponseStructure<Hospital>();
		if(getHospital !=null) {
		structure.setData(getHospital);
		structure.setMessage("hospital Found");
		structure.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<Hospital>>(structure,HttpStatus.OK);
		}else {
			return new ResponseEntity<ResponseStructure<Hospital>>(structure,HttpStatus.NOT_FOUND);
		}
		}

	public ResponseEntity<ResponseStructure<List<Hospital>>> findAllHospital() {
		List<Hospital> allHospitals = hospitalDao.getAllHospitals();
		ResponseStructure<List<Hospital>> structure=new ResponseStructure<List<Hospital>>();
		structure.setData(allHospitals);
		structure.setMessage("All hospitals Found");
		structure.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<List<Hospital>>>(structure,HttpStatus.OK);
	}

	public ResponseEntity<ResponseStructure<Boolean>> deleteHopital(int hospId) {
		boolean deleteHospital = hospitalDao.deleteHospital(hospId);
		ResponseStructure<Boolean> structure=new ResponseStructure<Boolean>();
		structure.setData(deleteHospital);
		structure.setMessage("hospital deleted");
		structure.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<Boolean>>(structure,HttpStatus.OK);
	}

	public ResponseEntity<ResponseStructure<Hospital>> updateEmployee(int hospId, Hospital hospital) {
		Hospital updateHospital = hospitalDao.updateHospital(hospId,hospital);
		ResponseStructure<Hospital> structure=new ResponseStructure<Hospital>();
		structure.setData(updateHospital);
		structure.setMessage("hospital updated sucessfully");
		structure.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<Hospital>>(structure,HttpStatus.OK);	
	}
	
	

}
