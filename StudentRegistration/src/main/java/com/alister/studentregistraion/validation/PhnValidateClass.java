package com.alister.studentregistraion.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PhnValidateClass implements ConstraintValidator<PhnValidator,Long>
{

	@Override
	public boolean isValid(Long value, ConstraintValidatorContext context) {

		String longAsString = Long.toString(value);
		if(longAsString.length()==10)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}

}
