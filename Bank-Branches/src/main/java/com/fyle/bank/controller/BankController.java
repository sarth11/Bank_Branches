package com.fyle.bank.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fyle.bank.model.BankBranches;
import com.fyle.bank.service.BankService;

/**
 * Main Controller class providing the end-points for all the API's
 * @author sarthak
 *
 */
@RestController
@RequestMapping(path = "/api/bank")
public class BankController {
	
	@Autowired
	private BankService bankService;

	@RequestMapping(value = "/getByIFSC", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public BankBranches getByIFSC(@Valid @RequestParam String ifsc) {
		return bankService.getByIFSC(ifsc);
	}
	
	@RequestMapping(value = "/getByBankNameAndCity", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<BankBranches> getByBankNameAndCity(@Valid @RequestParam String bank_name, @Valid @RequestParam String city) {
		return bankService.getByBankNameAndCity(bank_name, city);
	}
	
	
}
