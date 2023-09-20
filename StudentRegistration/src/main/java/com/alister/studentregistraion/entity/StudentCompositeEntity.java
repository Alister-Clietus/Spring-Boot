package com.alister.studentregistraion.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;



@Embeddable
public class StudentCompositeEntity 
{
	@Column(name="ID")
	private int id;
	@Column(name="KTUID	")
	private String ktuid;
	

	public StudentCompositeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentCompositeEntity(int id, String ktuid) {
		super();
		this.id = id;
		this.ktuid = ktuid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKtuid() {
		return ktuid;
	}
	public void setKtuid(String ktuid) {
		this.ktuid = ktuid;
	}

}
