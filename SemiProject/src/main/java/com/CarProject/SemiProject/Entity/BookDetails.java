package com.CarProject.SemiProject.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class BookDetails {

	public BookDetails() {
		super();
	}

	
	
private String carCompany;
	
	private String carColor;
	
	private String carModel;
	
	private String carType;
	
	private String carImg;
	
	private String carOwner;
	
	private String numPlate;
	
	private String regDate;
	
	private String insurance;
	
	
	private String insuranceValidity;
	
	private int passangerCapcity;
	private String fuelType;
	
	private String feature;
	
	private int totalPrice;
	
	private int charge;
	
	
	
	private String pickUpLocation;
	private String dropLocation;
	private String pickUpTime;
	private String pickUpDate;
	private String dropDate;
	private int passangerCapacity;
	private String Members;
	private int days;
	private String numBags;
	
	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int carId;
}
