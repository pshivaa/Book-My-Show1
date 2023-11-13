package com.CarProject.SemiProject.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.CarProject.SemiProject.Entity.DriverHotel;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DriverDetailsDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String hotel;
	private String room;
	private int stay;
	private  String manageParking;
	private Long finalCost;
}
