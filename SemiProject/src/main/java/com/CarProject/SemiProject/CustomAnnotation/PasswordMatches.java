package com.CarProject.SemiProject.CustomAnnotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.TYPE,ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordMatchesValidator.class)
@Documented
public @interface PasswordMatches {

	String message() default "Password don't match";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] playload() default {};
}
// @Target which is give element type
// @Retention which is give when you want to run 
// constraints which is validated by one class before that you must create one class then after you have be connect with
// @Documented which is inlcude in javaDoc file then we can use anywhere  in that class
// using @Interface annotation...
// String message() default ""
// class<?>[] groups() default {}
// class<? extends Playload>[] playload() default {};