package com.fyle.bank.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fyle.bank.model.BankBranches;

@Service
public interface BankService {

	BankBranches getByIFSC(String ifsc);

	List<BankBranches> getByBankNameAndCity(String bank_name, String city);

}
