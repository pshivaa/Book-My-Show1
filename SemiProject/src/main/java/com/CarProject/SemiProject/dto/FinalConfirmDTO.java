package com.CarProject.SemiProject.dto;

import javax.management.loading.PrivateClassLoader;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class FinalConfirmDTO {

	private String fname ;
	private String lname;
	private String  email;
	private String driverImg;
	private String driverID;
	private String driverName;
	private String driverMobNo;
	private String charges;
	private String hotel;
	private String room;
	private String stay;
	private String manageParking;
	private String finalCost;
	private String charge;
	private String carCompany;
	private String carColor;
	private String carModel;
	private String carType;
	private String carImg;
    private String fuelType;
    private String pickUpLocation;
    private String dropLocation;
    private String pickUpTime;
    private String pickUpDate;
    private String dropDate;
    private String passangerCapacity;
    private String members;
    private String days;
    private String cardNo;

}
