package com.alister.bankaccount.validation;

import org.springframework.util.StringUtils;

import com.alister.bankaccount.util.ApplicationProperties;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class MustSizeValidator implements ConstraintValidator<MustBe,String>
{
	private String size;
	@Override
	public void initialize(MustBe mustbe) {
		this.size=mustbe.sizeKey();
	}
	
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) 
	{
		int Size;
		if(ApplicationProperties.INSTANCE.getValue(size)==null)
		{
			Size=Integer.parseInt(size);
			
		}
		else
		{
			Size = Integer.parseInt(ApplicationProperties.INSTANCE.getValue(size));
		}
		 
		if (value.length()==Size) 
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
