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
@Constraint(validatedBy = PhnValidateClass.class)
public @interface PhnValidator 
{
	String message() default "Invalid Entry: Phone Number Should be equal to ten ";
	Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}
