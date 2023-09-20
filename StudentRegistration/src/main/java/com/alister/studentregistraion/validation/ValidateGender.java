package com.alister.studentregistraion.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Documented
@Constraint(validatedBy = GenderSizeValidator.class)
public @interface ValidateGender 
{
	String message() default "Invalid Entry: It must be Male or Female";
	Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };

}
