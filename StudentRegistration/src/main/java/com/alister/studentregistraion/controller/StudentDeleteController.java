package com.alister.studentregistraion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alister.studentregistraion.entity.StudentMainEntity;
import com.alister.studentregistraion.services.AddStudentDetails;

@RestController
@RequestMapping("/delete")
public class StudentDeleteController 
{
	
@Autowired
AddStudentDetails addstudentdetails;

@DeleteMapping("id")
void delete(
		 @PathVariable int idField1,
         @PathVariable String idField2,
         @RequestBody StudentMainEntity updateStudentDTO)
 {
	 
 }
}
