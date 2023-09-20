package com.alister.studentregistraion.services;

import java.util.List;
import java.util.Optional;

import com.alister.studentregistraion.dto.StudentTableDTO;
import com.alister.studentregistraion.entity.StudentMainEntity;

public interface AddStudentDetails 
{

	StudentMainEntity addStudentDetails(StudentTableDTO studenttabledto);
	List<StudentMainEntity> sortWithGender(String gender);
	List<StudentMainEntity> sortWithSemseter(int semester);
	List<StudentMainEntity> sortWithDistrict(String district);
	List<StudentMainEntity> sortWithMinor(Boolean minor);
	List<StudentMainEntity> sortWithHonors(Boolean honors);
	StudentMainEntity studentDetailsUpdate(int id, String field2, StudentTableDTO studenttabledto);
	StudentMainEntity studentDetailsDelete(int field1, String field2, StudentTableDTO studenttabledto);

}
