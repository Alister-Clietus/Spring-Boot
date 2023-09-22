package com.alister.bankaccount.entity;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="TRANSACTION_DETAILS")
public class TransactionTable 
{
	@EmbeddedId
	TransactionPrimaryKeysEntity transactionprimarykeysentity;
	@Column(name="NO_OF_COLUMNS")
	private Long no_of_columns;
	@Column(name="ACCOUNT NO")
	private String accountNo;
	public Long getNo_of_columns() {
		return no_of_columns;
	}
	public void setNo_of_columns(Long no_of_columns) {
		this.no_of_columns = no_of_columns;
	}
	public TransactionPrimaryKeysEntity getTransactionprimarykeysentity() {
		return transactionprimarykeysentity;
	}
	public void setTransactionprimarykeysentity(TransactionPrimaryKeysEntity transactionprimarykeysentity) {
		this.transactionprimarykeysentity = transactionprimarykeysentity;
	}
	@Column(name="AMOUNT")
    private BigDecimal amount;
	
	@Column(name="CREATED ON")
    private Date createdOn;
	
	@Column(name="IBAN")
    private String IBAN;
	@Column(name="ACCOUNT NAME")
    private String accountName;
	@Column(name="STATUS")
	private String status = "PENDING"; 

	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	
	public String getIBAN() {
		return IBAN;
	}
	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    
    
}
