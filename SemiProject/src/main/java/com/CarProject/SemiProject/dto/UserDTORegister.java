package com.CarProject.SemiProject.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.CarProject.SemiProject.CustomAnnotation.PasswordMatches;
import com.CarProject.SemiProject.Entity.UserRegister;

import lombok.Data;


@Data
@PasswordMatches
public class UserDTORegister {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String fname;
	private String lname;
	private String email;
	private  String password;
	private String userName;
	private String confirmPassword;

}
