package com.alister.bankaccount.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

import com.alister.bankaccount.util.ApplicationProperties;



public class CustomSizeValidator implements ConstraintValidator<CustomSize, String> {

	private String maxKey;
	private String minKey;

	@Override
	public void initialize(CustomSize customSize) {
		this.maxKey = customSize.minKey();
		this.minKey = customSize.maxKey();
	}

	@SuppressWarnings("deprecation")
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) 
	{
		int MaxValue,MinValue;
		if(ApplicationProperties.INSTANCE.getValue(maxKey)==null || ApplicationProperties.INSTANCE.getValue(minKey)==null)
		{
			MaxValue=Integer.parseInt(maxKey);
			MinValue=Integer.parseInt(minKey);
			
		}else
		{
			MaxValue = Integer.parseInt(ApplicationProperties.INSTANCE.getValue(maxKey));
			MinValue = Integer.parseInt(ApplicationProperties.INSTANCE.getValue(minKey));
		}
		 
		if (StringUtils.isEmpty(value) || value.length() > MinValue || value.length() < MaxValue) {
			return false;
		} 
		return true;
	}
}
