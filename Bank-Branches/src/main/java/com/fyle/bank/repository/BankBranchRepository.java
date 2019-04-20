package com.fyle.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.fyle.bank.model.BankBranches;

public interface BankBranchRepository extends CrudRepository<BankBranches, Long>{
	
	@Query(value="SELECT * FROM bank_branches WHERE ifsc = ?",nativeQuery=true) 
	public BankBranches findByIfsc(String ifsc);
	
	@Query(value="SELECT * FROM bank_branches WHERE bank_name = ? AND city = ?",nativeQuery=true) 
	public List<BankBranches> findByBank_nameAndCity(String bank_name, String city);
}
