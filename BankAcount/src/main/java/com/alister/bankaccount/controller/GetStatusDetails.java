package com.alister.bankaccount.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alister.bankaccount.entity.TransactionTable;
import com.alister.bankaccount.services.ServiceBankAcoount;

@RestController
@RequestMapping("/status")
public class GetStatusDetails 
{
	@Autowired
	ServiceBankAcoount servicebankacoout;
	
	@GetMapping("/{status}")
	List<TransactionTable> getStatus(@PathVariable String status)
	{
		System.out.println(status);
		
		return servicebankacoout.getStatusService(status);
	}
}
