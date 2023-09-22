package com.alister.bankaccount.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alister.bankaccount.entity.TransactionTable;
import com.alister.bankaccount.services.ServiceBankAcoount;

@RestController
@RequestMapping("/get")
public class GetDetails 
{
	@Autowired
	ServiceBankAcoount servicebankacoout;
	
	@GetMapping("/transaction/{transactionReference}/{bankCode}")
	Optional<TransactionTable> getTransactionDetails(
			@PathVariable String transactionReference,
			@PathVariable String bankCode
			)
	{
		Optional<TransactionTable> num1= servicebankacoout.getTransaction(transactionReference, bankCode);
		return num1;
	}
}
