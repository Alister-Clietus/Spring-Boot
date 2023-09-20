package com.alister.studentregistraion.dto;

import java.util.Date;

import com.alister.studentregistraion.validation.KTUIDValidator;
import com.alister.studentregistraion.validation.PhnValidator;
import com.alister.studentregistraion.validation.ValidateGender;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class StudentTableDTO 
{
	private int id;
	@KTUIDValidator
	private String ktuid;
	@Size(min = 6, max = 20)
	@NotEmpty(message = "{NotEmpty.studentTableDTO.name}")
	private String name;
	private String place;
	@PhnValidator
	private Long phonenumber;
	private String district;
	@NotEmpty(message = "{NotEmpty.studentTableDTO.email}")
	@Email
	private String Email;
	private Date DOB;
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	@ValidateGender
	private String gender;
	
	private int addno;
	@NotBlank(message="{NotBlank.studentTableDTO.branch}")
	private String branch;
	private int semester;
	@AssertTrue
	private boolean minor;
	private boolean honors;
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getAddno() {
		return addno;
	}
	public void setAddno(int addno) {
		this.addno = addno;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public boolean isMinor() {
		return minor;
	}
	public void setMinor(boolean minor) {
		this.minor = minor;
	}
	public boolean isHonors() {
		return honors;
	}
	public void setHonors(boolean honors) {
		this.honors = honors;
	}


}
