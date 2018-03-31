package com.diao.springmvc.mvc.vaildation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements
	ConstraintValidator<CourseCode, String> {

	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode courseCode) {
		this.coursePrefix = courseCode.value();
	}
	
	// arg1: HTML form data from user
	// arg2: additional error message
	@Override
	public boolean isValid(String inputCode, ConstraintValidatorContext extraErrorMsg) {
		boolean result = false;
		if(inputCode != null)
			result = inputCode.startsWith(coursePrefix);
		else
			result = true;
		return result;
	}

}
