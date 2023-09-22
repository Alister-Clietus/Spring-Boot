package com.alister.bankaccount.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class TransactionPrimaryKeysEntity 
{
	@Column(name="TRANSACTION REFERENCE")
    private String transactionReference;
	@Column(name="BANK CODE")
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
