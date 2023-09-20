package com.alister.databaseOperations.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alister.databaseOperations.DTO.NumbersDTO;
import com.alister.databaseOperations.Repository.Repository1;
import com.alister.databaseOperations.entity.NumberTable;


@Service
public class AddnumbersImplementation implements Addnumbers 
{

	@Autowired
	Repository1 repository1;
	
	
	public int addnumbers(NumbersDTO numbersdto) {
		NumberTable numbertable = new NumberTable();
		BeanUtils.copyProperties(numbersdto, numbertable);		
		repository1.save(numbertable);
		
		return 0;
	}
	
}
