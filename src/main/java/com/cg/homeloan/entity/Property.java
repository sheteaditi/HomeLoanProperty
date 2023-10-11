package com.cg.homeloan.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Property {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
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
	public Property(int price, String homeName, String homeCity, String description, double rating, String location,
			String ftName, String ltName, String phoneNumber, String mailId, double livingArea, int yearBuilt,
			int totalRooms, int bedrooms, String includes, int taxYear, String floodZone, String propertyType,
			LocalDate date, double marketValue, double priceSold, double change, String source, String more) {
		super();
		this.price = price;
		this.homeName = homeName;
		this.homeCity = homeCity;
		this.description = description;
		this.rating = rating;
		this.location = location;
		this.ftName = ftName;
		this.ltName = ltName;
		this.phoneNumber = phoneNumber;
		this.mailId = mailId;
		this.livingArea = livingArea;
		this.yearBuilt = yearBuilt;
		this.totalRooms = totalRooms;
		this.bedrooms = bedrooms;
		this.includes = includes;
		this.taxYear = taxYear;
		this.floodZone = floodZone;
		this.propertyType = propertyType;
		this.date = date;
		this.marketValue = marketValue;
		this.priceSold = priceSold;
		this.change = change;
		this.source = source;
		this.more = more;
	}
	
	
	
	

}
