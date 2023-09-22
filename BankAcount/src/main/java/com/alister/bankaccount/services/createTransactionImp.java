package com.alister.bankaccount.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alister.bankaccount.dto.TransactionRequestDTO;
import com.alister.bankaccount.entity.TransactionPrimaryKeysEntity;
import com.alister.bankaccount.entity.TransactionTable;
import com.alister.bankaccount.repository.TransactionRepository;

@Service
public class createTransactionImp implements ServiceBankAcoount
{
	@Autowired
	TransactionRepository transactionrepository;
	
	@Override
	public int createTransaction(TransactionRequestDTO transactionrequestdto) 
	{
		TransactionPrimaryKeysEntity transactionprimarykeysentity=new TransactionPrimaryKeysEntity();
		TransactionTable transactiontable = new TransactionTable();
		Date currentDate = new Date();
		transactionprimarykeysentity.setBankCode(transactionrequestdto.getBankCode());
		transactionprimarykeysentity.setTransactionReference(transactionrequestdto.getTransactionReference());
		transactiontable.setTransactionprimarykeysentity(transactionprimarykeysentity);
		Long numid=transactionrepository.findMxNoOfColumns();
		if(numid!=null)
		{
			numid=numid+1;
		}
		else
		{
			numid=(long)0;
		}
		Optional<TransactionTable> num = transactionrepository.findById(transactionprimarykeysentity);
		if(num!=null)
		{
			transactiontable.setNo_of_columns(numid);
			transactiontable.setAccountName(transactionrequestdto.getAccountName());
			transactiontable.setAccountNo(transactionrequestdto.getAccountNo());
			transactiontable.setAmount(transactionrequestdto.getAmount());
			transactiontable.setCreatedOn(currentDate);
			transactiontable.setIBAN(transactionrequestdto.getIBAN());
			transactionrepository.save(transactiontable);
//			String Str1 = transactionrepository.findDistinctAccoutName();
//			System.out.println(Str1);
			return 1;
		}
		else
		{
			return 0;
		}
		
		
		
		
	}

	@Override
	public Optional<TransactionTable> getTransaction(String transactionReference, String bankCode) {
		TransactionPrimaryKeysEntity transactionprimarykeysentity=new TransactionPrimaryKeysEntity();
		transactionprimarykeysentity.setBankCode(bankCode);
		transactionprimarykeysentity.setTransactionReference(transactionReference);
		return transactionrepository.findById(transactionprimarykeysentity);
	}

	@Override
	public int updateTableStatus(String transactionReference, String bankCode) 
	{
		TransactionPrimaryKeysEntity transactionprimarykeysentity=new TransactionPrimaryKeysEntity();
		TransactionTable transactiontable = new TransactionTable();
		
		
		transactionprimarykeysentity.setBankCode(bankCode);
		transactionprimarykeysentity.setTransactionReference(transactionReference);
		Optional<TransactionTable> num = transactionrepository.findById(transactionprimarykeysentity);
		if(num!=null)
		{
			transactiontable=num.get();
			transactiontable.setStatus("VERIFIED");
			transactionrepository.save(transactiontable);
			return 1;
		}
		else
			
		{
			return 0;
		}
	}

	@Override
	public List<TransactionTable> getStatusService(String status) 
	{
		List<TransactionTable> num1=transactionrepository.findByStatus(status);
		return num1;
	}



}
