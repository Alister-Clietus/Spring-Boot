package com.alister.databaseOperations.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "NUMBER_TABLE")
public class NumberTable {

	@Id
	@Column(name="NUMBER1")
	private Integer number1;
	@Column(name="NUMBER2")
	private Integer number2;
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(Integer number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(Integer number2) {
		this.number2 = number2;
	}
	
}
