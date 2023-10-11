package com.cg.homeloan.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropertyDTO {
	
	private int price;
	private String homeName;
	private String homeCity;
	private String description;
	private double rating;
	private String location;
	private String ftName;
	private String ltName;
	private String phoneNumber;
	private String mailId;
	private double livingArea;
	private int yearBuilt;
	private int totalRooms;
	private int bedrooms;
	private String includes;
	private int taxYear;
	private String floodZone;
	private String propertyType;
	private LocalDate date;
	private double marketValue;
	private double priceSold;
	private double change;
	private String source;
	private String more;

}
