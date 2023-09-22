package com.alister.bankaccount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alister.bankaccount.dto.VerifyDTO;
import com.alister.bankaccount.entity.TransactionTable;
import com.alister.bankaccount.services.ServiceBankAcoount;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/update")
public class UpdateData 
{
	@Autowired
	ServiceBankAcoount servicebankacoout;
	
	@PutMapping("/verify")
	String VerifyTheStatus(@Valid @RequestBody VerifyDTO verifydto)
	{
		String str1;
		int num= servicebankacoout.updateTableStatus(verifydto.getTransactionReference(),verifydto.getBankCode());
        if(num ==1)
        {
        	str1="The Status get Updated of Transaction Refereance"+verifydto.getTransactionReference()+" and BankCode"+verifydto.getBankCode();
        }
        else
        {
        	str1="Id Alreafy Existed";
        }
        return str1;
	}
}
