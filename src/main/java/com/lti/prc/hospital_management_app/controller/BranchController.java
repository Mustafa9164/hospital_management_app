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

import com.lti.prc.hospital_management_app.entities.Branch;
import com.lti.prc.hospital_management_app.service.BranchService;
import com.lti.prc.hospital_management_app.util.ResponseStructure;

@RestController
@RequestMapping("/branch")
public class BranchController {
	
	@Autowired
	private BranchService branchService;
	
	@PostMapping("/save")
	public ResponseEntity<ResponseStructure<Branch>> saveBranch(@RequestParam int hosptId, @RequestBody Branch branch){
		return branchService.saveBranch(hosptId,branch);
	}
	@GetMapping("/byId")
	public ResponseEntity<ResponseStructure<Branch>> getBranchById(@RequestParam int brachId){
		return branchService.getBranchById(brachId);
	}
	@GetMapping("/findAll")
	public ResponseEntity<ResponseStructure<List<Branch>>> getAllBranch(){
		return branchService.findAllBranch();
	}
	@DeleteMapping("/delete")
	public ResponseEntity<ResponseStructure<Boolean>> deleteBranch(@RequestParam int brachId){
		return branchService.deleteBranch(brachId);
	}
	@PutMapping("/update")
		public ResponseEntity<ResponseStructure<Branch>> updateBranch(@RequestParam int brachId,@RequestBody Branch branch){
			return branchService.updateBranch(brachId,branch);
	}
}
