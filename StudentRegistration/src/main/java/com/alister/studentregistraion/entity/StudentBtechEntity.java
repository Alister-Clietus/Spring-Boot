package com.alister.studentregistraion.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class StudentBtechEntity 
{
	@Column(name="ADDNO")
	private int addno;
	@Column(name="BRANCH")
	private String branch;
	@Column(name="SEMESTER")
	private int semester;
	@Column(name="MINOR")
	private boolean minor;
	@Column(name="HONORS")
	private boolean honors;
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
