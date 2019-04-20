package com.fyle.bank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fyle.bank.model.BankBranches;
import com.fyle.bank.repository.BankBranchRepository;
import com.fyle.bank.service.BankService;

@Service
public class BankServiceImpl implements BankService {

	@Autowired
	private BankBranchRepository bankBranchRepository;

	@Override
	public BankBranches getByIFSC(String ifsc) {
		return bankBranchRepository.findByIfsc(ifsc);
	}

	@Override
	public List<BankBranches> getByBankNameAndCity(String bank_name, String city) {
		return bankBranchRepository.findByBank_nameAndCity(bank_name, city);
	}

}
