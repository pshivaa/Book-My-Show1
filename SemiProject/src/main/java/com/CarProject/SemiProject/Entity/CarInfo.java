package com.CarProject.SemiProject.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class CarInfo {


	public CarInfo() {
		super();
	}

	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int carId;
	
	@Column(name="carCompany",nullable = false)
	private String CarCompany;
	
	@Column(name="carColor",nullable = false)
	private String CarColor;
	
	@Column(name="carModel",nullable = false)
	private String CarModel;
	
	@Column(name="carType",nullable = false)
	private String CarType;
	
	@Column(name="carImg",nullable = false)
	private String CarImg;
	
	@Column(name="carOwner",nullable = false)
	private String CarOwner;
	
	@Column(name="numPlate",nullable = false)
	private String NumPlate;
	
	@Column(name="regDate",nullable = false)
	private String RegDate;
	
	@Column(name="insurance",nullable = false)
	private String Insurance;
	
	@Column(name="car360",nullable = false)
	private String car360;
	
	@Column(name="insuranceValidity",nullable = false)
	private String InsuranceValidity;
	
	@Column(name="passangerCapcity",nullable = false)
	private int PassangerCapcity;
	
	@Column(name="fuelType",nullable = false)
	private String FuelType;
	
	@Column(name="feature",nullable = false)
	private String Feature;
	
	@Column(name="totalPrice",nullable = false)
	private int TotalPrice;
	
	
	@Column(name="charge",nullable = false)
	private int Charge;

}
