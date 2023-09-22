package com.alister.bankaccount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alister.bankaccount.dto.TransactionRequestDTO;
import com.alister.bankaccount.services.ServiceBankAcoount;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/create")
public class CreateAccountController 
{
	@Autowired
	ServiceBankAcoount servicebankacoout;
	
	@PostMapping("/bankingtransaction")
	String createAccount(@Valid @RequestBody TransactionRequestDTO transactionrequestdto)
	{
		String str1;
		int test= servicebankacoout.createTransaction(transactionrequestdto);
		if(test==1)
		{
			str1="The data with Transaction Request "+transactionrequestdto.getTransactionReference()+" and BankCode "+transactionrequestdto.getBankCode()+" get updated to the database";
		}
		else
		{
			str1="Not Inserted: Primary Key Existed";
		}
		return str1;
	}
}
