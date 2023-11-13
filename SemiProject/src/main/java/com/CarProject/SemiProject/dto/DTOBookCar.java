package com.CarProject.SemiProject.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class DTOBookCar {

	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int carId;
	private String pickUpLocation;
	private String dropLocation;
	private String pickUpTime;
	private String pickUpDate;
	private int passangerCapacity;
	private String Members;
	private int days;
	private String numBags;

}
