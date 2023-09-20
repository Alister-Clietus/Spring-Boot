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
@Constraint(validatedBy = KTUIDValidatorClass.class)
public @interface KTUIDValidator 
{
	String message() default "Invalid Entry: Should be in the form: 1st 3Characters, then 2 Numbers then 2 characters then 3 digits";
	Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };

}
