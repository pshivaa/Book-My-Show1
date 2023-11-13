package com.CarProject.SemiProject.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverDetails {

	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="driverImg",nullable = false)
	private String DriverImg;
	
	@Column(name="driverName",nullable = false)
	private String DriverName;
	
	@Column(name="drivingExperiance",nullable = false)
	private String DrivingExperiance;
	
	@Column(name="driverMobNo",nullable = false)
	private String DriverMobNo;
	
	@Column(name="charges",nullable = false)
	private String Charges;

	@Column(name="availability",nullable = false)
	private String Availability;
	
	@Column(name="food",nullable = false)
	private String Food;
	
	@Column(name="smoke",nullable = false)
	private  String Smoke;
	
	@Column(name="drink",nullable = false)
	private String Drink;
}
