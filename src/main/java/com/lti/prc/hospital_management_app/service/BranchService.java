package com.lti.prc.hospital_management_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.lti.prc.hospital_management_app.dao.BranchDao;
import com.lti.prc.hospital_management_app.entities.Branch;
import com.lti.prc.hospital_management_app.util.ResponseStructure;

@Service
public class BranchService {

	@Autowired
	private BranchDao branchDao;
	
	

	public ResponseEntity<ResponseStructure<Branch>> saveBranch(Branch branch) {
		Branch saveBranch = branchDao.saveBranch(branch);
		ResponseStructure<Branch> structure=new ResponseStructure<Branch>();
		structure.setData(saveBranch);
		structure.setMessage("branch saved");
		structure.setStatusCode(HttpStatus.CREATED.value());
		return new ResponseEntity<ResponseStructure<Branch>>(structure,HttpStatus.CREATED);
	}



	public ResponseEntity<ResponseStructure<Branch>> getBranchById(int brachId) {
		Branch branchById = branchDao.getBranchById(brachId);
		ResponseStructure<Branch> structure=new ResponseStructure<Branch>();
		if(branchById != null) {
		structure.setData(branchById);
		structure.setMessage("branch found");
		structure.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<Branch>>(structure,HttpStatus.OK);
		}else {
			structure.setData(branchById);
			structure.setMessage("Branch Not Found");
			structure.setStatusCode(HttpStatus.BAD_REQUEST.value());
			return new ResponseEntity<ResponseStructure<Branch>>(structure,HttpStatus.BAD_REQUEST);
		}
	}



	public ResponseEntity<ResponseStructure<List<Branch>>> findAllBranch() {
		List<Branch> findAllBranch = branchDao.findAllBranch();
		ResponseStructure<List<Branch>> structure=new ResponseStructure<List<Branch>>();
		structure.setData(findAllBranch);
		structure.setMessage("branchs found");
		structure.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<List<Branch>>>(structure,HttpStatus.OK);
		
	}



	public ResponseEntity<ResponseStructure<Boolean>> deleteBranch(int brachId) {
		boolean deleteBranch = branchDao.deleteBranch(brachId);
		ResponseStructure<Boolean> structure=new ResponseStructure<Boolean>();
		structure.setData(deleteBranch);
		structure.setMessage("branch deleted");
		structure.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<Boolean>>(structure,HttpStatus.OK);
	}



	public ResponseEntity<ResponseStructure<Branch>> updateBranch(int brachId, Branch branch) {
		Branch updateBranch = branchDao.updateBranch(brachId,branch);
		ResponseStructure<Branch> structure=new ResponseStructure<Branch>();
		structure.setData(updateBranch);
		structure.setMessage("branch updated sucessfully");
		structure.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<Branch>>(structure,HttpStatus.OK);
	}
	
	

}
