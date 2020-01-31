package com.example.controller;

import java.util.LinkedHashMap;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@NotNull
@AllArgsConstructor
@Setter
@Getter
public class Student {
	@NotNull
	@Size(min = 5,max=20,message = "first name required")
	private String firstName;
	@NotNull
	@Size(min = 5,max =20,message = "second name required")
	private String lastName;
	@Email(message = "provide valid email")
	private String email;
	private String country;
	@NotNull
	@Range(min =18,max = 55,message = "")
	private int age;
@Pattern(regexp = "^[1-9][0-9][0-9][0-9][0-9][0-9]$")
	private String zipCode;
	
	private LinkedHashMap<String, String> countryOptions;
	
	private String favoriteLanguage;
	
	private String[] operatingSystems;
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
	StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
	dataBinder.registerCustomEditor(Student.class, stringTrimmerEditor);
	}
public Student() {
		
		// populate country options: used ISO country code
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States of America");		

	}

}
