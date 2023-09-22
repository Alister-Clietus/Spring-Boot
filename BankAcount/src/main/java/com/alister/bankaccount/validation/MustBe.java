package com.alister.bankaccount.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Constraint(validatedBy = MustSizeValidator.class)
public @interface MustBe 
{
	String message() default "Should have be Equal to Particular Length";
	Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
	String sizeKey() default "8";

}
