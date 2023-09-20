package com.alister.studentregistraion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alister.studentregistraion.dto.StudentTableDTO;

import com.alister.studentregistraion.entity.StudentMainEntity;
import com.alister.studentregistraion.services.AddStudentDetails;

import jakarta.validation.Valid;

@RestController
@RequestMapping
public class StudentRegistrationController 
{
	@Autowired
	AddStudentDetails addstudentdetails;
	
	
	@PostMapping("/add")
	StudentMainEntity main(@Valid @RequestBody StudentTableDTO studenttabledto)
	{
		
		StudentMainEntity studentmainentity = new StudentMainEntity();
		studentmainentity=addstudentdetails.addStudentDetails(studenttabledto);
		return studentmainentity;
		
		
	}
	@PostMapping("/sortgender")
	List<StudentMainEntity> sortGender(@RequestParam String gender)
	{
		List<StudentMainEntity> num=addstudentdetails.sortWithGender(gender);
		return num;
	}
	@GetMapping("/sortdistrict")
	void sortDistrict(@RequestParam String district)
	{
		List<StudentMainEntity> num2=addstudentdetails.sortWithGender(district);
		System.out.println(num2);
	}
	@GetMapping("/sortsemester")
	List<StudentMainEntity> sortSemester(@RequestParam int semester)
	{
		List<StudentMainEntity> num2=addstudentdetails.sortWithSemseter(semester);
		return num2;
		
	}
	@GetMapping("/isminor")
	List<StudentMainEntity> isMinor(@RequestParam Boolean minor)
	{
		List<StudentMainEntity> num2=addstudentdetails.sortWithMinor(minor);
		return num2;
		
	}
	@GetMapping("/ishonors")
	List<StudentMainEntity> isHonors(@RequestParam Boolean minor)
	{
		List<StudentMainEntity> num2=addstudentdetails.sortWithHonors(minor);
		return num2;
		
	}
}
