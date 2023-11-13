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
public class FinalConfirm {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="email")
	private String Email;
	
	@Column(name="fname")
	private String FirstName;
	
	@Column(name="lname")
	private String LastName;
	
	@Column(name="driverImg")
	private String DriverImg;
	
	@Column(name="driverName")
	private String DriverName;
	
	@Column(name="driverMobNo")
	private String DriverMobNo;

	@Column(name="charges")
	private String Charges;
	
	@Column(name="hotel")
	private String Hotel;
	
	@Column(name="room")
	private String Room;
	
	@Column(name="stay")
	private String Stay;
	
	@Column(name="manageParking")
	private  String ManageParking;
	
	@Column(name="finalCost")
	private Long FinalCost;
	
	@Column(name="carCompany")
	private String CarCompany;
	
	@Column(name="carColor")
	private String CarColor;
	
	@Column(name="carModel")
	private String CarModel;
	
	@Column(name="carType")
	private String CarType;
	
	@Column(name="carImg")
	private String CarImg;
	
	@Column(name="fuelType")
	private String FuelType;
	
	
	@Column(name="pickUpLocation")
	private String PickUpLocation;
	
	@Column(name="dropLocation")
	private String DropLocation;
	
	@Column(name="pickUpTime")
	private String PickUpTime;
	
	@Column(name="pickUpDate")
	private String PickUpDate;
	
	@Column(name="dropDate")
	private String DropDate;
	
	@Column(name="passangerCapacity")
	private int PassangerCapacity;
	
	@Column(name="Members")
	private String Members;
	
	@Column(name="days")
	private String Days;
	
	public FinalConfirm() {
		super();
	}

	@Column(name="cardNo")
	private String CardNo;

}
