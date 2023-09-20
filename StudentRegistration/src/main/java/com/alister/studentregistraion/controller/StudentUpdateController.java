package com.alister.studentregistraion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alister.studentregistraion.dto.StudentTableDTO;
import com.alister.studentregistraion.entity.StudentMainEntity;
import com.alister.studentregistraion.services.AddStudentDetails;

@RestController
@RequestMapping("/update")
public class StudentUpdateController 
{
	@Autowired
	AddStudentDetails addstudentdetails;
	
	@PutMapping("/{field1}/{field2}")
	public StudentMainEntity updateStudentById(
			@PathVariable int field1,
			@PathVariable String field2,
			@RequestBody StudentTableDTO studenttabledto)
	{
        return addstudentdetails.studentDetailsUpdate(field1,field2, studenttabledto);
    }
}

