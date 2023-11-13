package com.CarProject.SemiProject.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class UserBookCar {

	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int carId;
	
	@Column(name="pickUpLocation",nullable = false)
	private String PickUpLocation;
	
	@Column(name="dropLocation",nullable = false)
	private String DropLocation;
	
	@Column(name="pickUpTime",nullable = false)
	private String PickUpTime;
	
	@Column(name="pickUpDate",nullable = false)
	private String PickUpDate;
	
	@Column(name="passangerCapacity",nullable = false)
	private int PassangerCapacity;
	
	@Column(name="Members",nullable = false)
	private String Members;
	
	@Column(name="dropDate",nullable = false)
	private String DropDate;
	
	@Column(name="days",nullable = false)
	private int Days;
	
	@Column(name="numBags",nullable = false)
	private String NumBags;
	
	

}
