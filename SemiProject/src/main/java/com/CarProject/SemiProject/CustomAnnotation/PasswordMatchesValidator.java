package com.CarProject.SemiProject.CustomAnnotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.CarProject.SemiProject.dto.UserDTORegister;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches,Object> {

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		UserDTORegister userDTORegister=(UserDTORegister)value;
		return userDTORegister.getPassword().equals(userDTORegister.getConfirmPassword());
	}

	

}
