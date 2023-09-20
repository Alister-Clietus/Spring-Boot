package com.alister.studentregistraion.validation;

import java.util.Arrays;
import java.util.List;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class GenderSizeValidator implements ConstraintValidator<ValidateGender, String>
{
	@Override
	public boolean isValid(String gendertype, ConstraintValidatorContext context) 
	{
		List<String> gendertypes=Arrays.asList("Male","Female");
		return gendertypes.contains(gendertype);
	}

}
