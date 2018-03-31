package com.diao.springmvc;

import javax.validation.constraints.*;

import com.diao.springmvc.mvc.vaildation.CourseCode;

public class Customer {
	private String firstName;
	
	@NotNull(message=" required ") // basic validation rules
	@Size(min = 1, message=" required ")
	private String lastName;
	
	@NotNull(message=" required ")
	@Max(value=10, message=" must be less than or equal to 10")
	@Min(value=0, message=" must be greater than or equal to 0")
	private Integer freePasses;
	
	@NotNull(message=" required ")
	@Pattern(regexp="^\\w{5}", message=" only 5 chars/digits")
	private String postalCode;
	
	@CourseCode
	private String courseCode;
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
}
