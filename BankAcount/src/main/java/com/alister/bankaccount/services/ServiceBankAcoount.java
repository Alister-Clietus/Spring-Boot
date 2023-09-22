package com.alister.bankaccount.services;

import java.util.List;
import java.util.Optional;

import com.alister.bankaccount.dto.TransactionRequestDTO;
import com.alister.bankaccount.entity.TransactionTable;

public interface ServiceBankAcoount 
{
	int createTransaction(TransactionRequestDTO transactionrequestdto);
	Optional<TransactionTable> getTransaction(String transactionReference,String bankCode);
	int updateTableStatus(String transactionReference,String bankCode);
	List<TransactionTable> getStatusService(String status);
}
