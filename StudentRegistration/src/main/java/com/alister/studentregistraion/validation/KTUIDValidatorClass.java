package com.alister.studentregistraion.validation;

import java.util.regex.Pattern;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class KTUIDValidatorClass implements ConstraintValidator<KTUIDValidator,String> {

    private static final String PATTERN_REGEX = "^[A-Za-z]{3}\\d{2}[A-Za-z]{2}\\d{3}$";
    private static final Pattern PATTERN = Pattern.compile(PATTERN_REGEX);
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value != null && PATTERN.matcher(value).matches())
		return true;
		else
		return false;
			
	}

}
