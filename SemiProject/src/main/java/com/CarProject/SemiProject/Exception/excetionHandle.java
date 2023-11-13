package com.CarProject.SemiProject.Exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class excetionHandle extends RuntimeException{

	String resourceName;
	
	String username;
	
	String resourceValue;
	

}
