package com.alister.studentregistraion.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class StudentPersonalEntity 
{
	@Column(name="PLACE")
	private String place;
	@Column(name="PHONENUMBER")
	private Long phonenumber;
	@Column(name="DISTRICT")
	private String district;
	@Column(name="GENDER")
	private String gender;
	@Column(name="EMAIL")
	private String Email;
	@Column(name="DOB")
	private Date DOB;
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
}
