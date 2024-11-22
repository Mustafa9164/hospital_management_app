package com.lti.prc.hospital_management_app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.prc.hospital_management_app.entities.Branch;
import com.lti.prc.hospital_management_app.repository.BranchRepository;

@Repository
public class BranchDao {
	
	@Autowired
	private BranchRepository branchRepository;

	public Branch saveBranch(Branch branch) {
		return branchRepository.save(branch);
	}

	public Branch getBranchById(int brachId) {
		Optional<Branch> optional = branchRepository.findById(brachId);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	public List<Branch> findAllBranch() {
		return branchRepository.findAll();
	}

	

	public Branch updateBranch(int brachId, Branch branch) {
		Optional<Branch> optional = branchRepository.findById(brachId);
		if(optional.isPresent()) {
			branch.setBrachId(brachId);
			return branchRepository.save(branch);
		}
		return null;
	}

	public boolean deleteBranch(int brachId) {
		Optional<Branch> optional = branchRepository.findById(brachId);
		if(optional.isPresent()) {
			branchRepository.delete(optional.get());
			return true;
		}
		return false;		
	}

}
