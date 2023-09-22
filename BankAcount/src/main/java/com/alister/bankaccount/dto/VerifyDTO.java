package com.alister.bankaccount.dto;

import com.alister.bankaccount.validation.MustBe;

public class VerifyDTO 
{
	@MustBe(sizeKey = "VerifyDTO.transactionReference.size",message = "{MustBe.transactionRequestDTO.transactionReference}")
	private String transactionReference;
	@MustBe(sizeKey = "VerifyDTO.bankCode.size",message = "{MustBe.bankCode.size}")
	private String bankCode;
	public String getTransactionReference() {
		return transactionReference;
	}
	public void setTransactionReference(String transactionReference) {
		this.transactionReference = transactionReference;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}


}
