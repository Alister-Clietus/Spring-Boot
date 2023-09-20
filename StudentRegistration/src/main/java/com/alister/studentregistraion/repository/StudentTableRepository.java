package com.alister.studentregistraion.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alister.studentregistraion.entity.StudentCompositeEntity;
import com.alister.studentregistraion.entity.StudentMainEntity;

public interface StudentTableRepository extends JpaRepository<StudentMainEntity,StudentCompositeEntity>
{
	
	 List<StudentMainEntity> findBystudentpersonalentityGender(String gender);
	 List<StudentMainEntity> findBystudentpersonalentityDistrict(String district);
	 List<StudentMainEntity> findBystudentbtechentitySemester(int semester);
	 List<StudentMainEntity> findBystudentbtechentityMinor(Boolean minor);
	 List<StudentMainEntity> findBystudentbtechentityHonors(Boolean honors);
	
}
