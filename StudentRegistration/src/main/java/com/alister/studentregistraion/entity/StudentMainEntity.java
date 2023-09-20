package com.alister.studentregistraion.entity;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="STUDENT")
public class StudentMainEntity 
{

	@EmbeddedId
    private StudentCompositeEntity studentcomposite;
	
	@Embedded
	StudentPersonalEntity studentpersonalentity;
	@Embedded
	StudentBtechEntity studentbtechentity;
	
	public StudentCompositeEntity getStudentcomposite() {
		return studentcomposite;
	}
	public void setStudentcomposite(StudentCompositeEntity studentcomposite) {
		this.studentcomposite = studentcomposite;
	}
	public StudentPersonalEntity getStudentpersonalentity() {
		return studentpersonalentity;
	}
	public void setStudentpersonalentity(StudentPersonalEntity studentpersonalentity) {
		this.studentpersonalentity = studentpersonalentity;
	}
	public StudentBtechEntity getStudentbtechentity() {
		return studentbtechentity;
	}
	public void setStudentbtechentity(StudentBtechEntity studentbtechentity) {
		this.studentbtechentity = studentbtechentity;
	}

}
