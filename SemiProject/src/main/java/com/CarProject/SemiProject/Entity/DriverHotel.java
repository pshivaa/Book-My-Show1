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
public class DriverHotel {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="hotel",nullable = false)
	private String Hotel;
	
	@Column(name="room",nullable = false)
	private String Room;
	
	@Column(name="stay")
	private String Stay;
	
	@Column(name="manageParking",nullable = false)
	private  String ManageParking;
	
	@Column(name="finalCost",nullable = false)
	private Long FinalCost;
	
	public DriverHotel() {
		super();
	}

}
