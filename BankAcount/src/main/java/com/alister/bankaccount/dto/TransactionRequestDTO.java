package com.alister.bankaccount.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.alister.bankaccount.validation.CustomSize;
import com.alister.bankaccount.validation.MustBe;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class TransactionRequestDTO 
{
	@CustomSize(minKey = "transactionRequestDTO.accountNo.min", maxKey = "transactionRequestDTO.accountNo.max",message = "{CustomSize.transactionRequestDTO.accountNo}")	
	private String accountNo;
	@NotNull
	@Digits(integer=12,fraction=4)
    private BigDecimal amount;
	@MustBe(sizeKey = "transactionRequestDTO.transactionReference.size",message = "{MustBe.transactionRequestDTO.transactionReference}")
	@NotEmpty
    private String transactionReference;
    private Date createdOn;
    @NotEmpty
	@MustBe(sizeKey = "transactionRequestDTO.bankCode.size",message = "{MustBe.bankCode.size}")
    private String bankCode;
	@MustBe(sizeKey = "transactionRequestDTO.IBAN.size",message = "{MustBe.transactionRequestDTO.IBAN}")
    private String IBAN;
	@CustomSize(minKey = "transactionRequestDTO.accountName.min", maxKey = "transactionRequestDTO.accountName.max",message = "{CustomSize.transactionRequestDTO.accountName}")	
    @NotEmpty
    private String accountName;
    @NotEmpty
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
	public String getTransactionReference() {
		return transactionReference;
	}
	public void setTransactionReference(String transactionReference) {
		this.transactionReference = transactionReference;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
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
	private String status;

}
