package com.alister.studentregistraion.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alister.studentregistraion.dto.StudentTableDTO;
import com.alister.studentregistraion.entity.StudentBtechEntity;
import com.alister.studentregistraion.entity.StudentCompositeEntity;
import com.alister.studentregistraion.entity.StudentMainEntity;
import com.alister.studentregistraion.entity.StudentPersonalEntity;
import com.alister.studentregistraion.repository.StudentTableRepository;


@Service
public class AddStudentDetailsImp implements AddStudentDetails
{
	StudentMainEntity studentmainentity = new StudentMainEntity();
	
	StudentPersonalEntity studentpersonalentity = new StudentPersonalEntity();
	StudentBtechEntity studentbtechentity = new StudentBtechEntity();

	@Autowired
	StudentTableRepository studenttablerepository;
	
	
	@Override
	public StudentMainEntity addStudentDetails(StudentTableDTO studenttabledto) 
	{
		StudentCompositeEntity studentcompositeentity=new StudentCompositeEntity();
		studentcompositeentity.setId(studenttabledto.getId());
		studentcompositeentity.setKtuid(studenttabledto.getKtuid());
		studentmainentity.setStudentcomposite(studentcompositeentity);
		
		studentpersonalentity.setDistrict(studenttabledto.getDistrict());
		studentpersonalentity.setGender(studenttabledto.getGender());
		studentpersonalentity.setPhonenumber(studenttabledto.getPhonenumber());
		studentpersonalentity.setPlace(studenttabledto.getPlace());
		studentmainentity.setStudentpersonalentity(studentpersonalentity);
		
		studentbtechentity.setAddno(studenttabledto.getAddno());
		studentbtechentity.setBranch(studenttabledto.getBranch());
		studentbtechentity.setHonors(studenttabledto.isHonors());
		studentbtechentity.setSemester(studenttabledto.getSemester());
		studentbtechentity.setMinor(studenttabledto.isMinor());
		studentmainentity.setStudentbtechentity(studentbtechentity);
		
		studenttablerepository.save(studentmainentity);
		return studentmainentity;
	}
	public List<StudentMainEntity> sortWithGender(String gender)
	{
		return studenttablerepository.findBystudentpersonalentityGender(gender);
	}
	public List<StudentMainEntity> sortWithDistrict(String district)
	{
		return studenttablerepository.findBystudentpersonalentityDistrict(district);
	}
	public List<StudentMainEntity> sortWithSemseter(int semester)
	{
		return studenttablerepository.findBystudentbtechentitySemester(semester);
	}
	public List<StudentMainEntity> sortWithMinor(Boolean minor)
	{
		return studenttablerepository.findBystudentbtechentityMinor(minor);
	}
	public List<StudentMainEntity> sortWithHonors(Boolean honors)
	{
		return studenttablerepository.findBystudentbtechentityHonors(honors);
	}
	
	public StudentMainEntity studentDetailsUpdate(int field1, String field2, StudentTableDTO studenttabledto)
	{
		StudentCompositeEntity studentcompositeentity=new StudentCompositeEntity();
		Optional<StudentMainEntity> num=studenttablerepository.findById(new StudentCompositeEntity(field1,field2));
		StudentMainEntity existingStudent = num.get();
		studentcompositeentity.setId(field1);
		studentcompositeentity.setKtuid(field2);
		existingStudent.setStudentcomposite(studentcompositeentity);
		return existingStudent;
		
	}
	public StudentMainEntity studentDetailsDelete(int field1, String field2, StudentTableDTO studenttabledto)
	{
		StudentCompositeEntity studentcompositeentity=new StudentCompositeEntity();
		studentcompositeentity.setId(field1);
		studentcompositeentity.setKtuid(field2);
		studenttablerepository.deleteById(studentcompositeentity);
		return studentmainentity;
		
	}
	
	
}
