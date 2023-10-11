package com.cg.homeloan.validations;

import java.util.HashMap;
import java.util.Map;

import com.cg.homeloan.entity.Property;

public class PropertyValidators {
	
	 public PropertyValidators() {
		 
	 }
		 
		 public Map<String, String> validate(Property property) {

				Map<String, String> errors = new HashMap<>();
		 
		 
		 
		 
				// Validate the ftName field.
		 if (property.getFtName().isEmpty()) {
				errors.put("ftName", "The ft name field is empty.");
			} else if (property.getFtName().length() > 12) {
				errors.put("ftName", "The ft name field must be less than 12 alphabets.");
			} else if (!property.getFtName().matches("[a-zA-Z]+")) {
				errors.put("ftName", "The ft name field must contain only alphabets.");
			}
			
		 		// Validate the ltName field.
			if (property.getLtName().isEmpty()) {
				errors.put("ltName", "The lt name field is empty.");
			} else if (property.getLtName().length() > 15) {
				errors.put("ltName", "The lt name field must be less than 15 characters.");
			} else if (!property.getLtName().matches("[a-zA-Z]+")) {
				errors.put("ltName", "The lt name field must contain only alphabets.");
			}
			
			// Validate the phoneNumber field.
			String phoneNumber = "^\\d{10}$";
			if (property.getPhoneNumber().isEmpty()) {
				errors.put("phoneNumber", "phoneNumber field is empty.");
			} else if (!property.getPhoneNumber().matches(phoneNumber)) {
				errors.put("phoneNumber", "phoneNumber field is invalid.");
			}
			
			// Validate the mailId field.
			String mailId = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
			if (property.getMailId().isEmpty()) {
				errors.put("mailId", "mailId field is empty.");
			} else if (!property.getMailId().matches(mailId)) {
				errors.put("mailId", "mailId field is invalid.");
			}
			
			// Validate the living area field.
			if (property.getLivingArea() == 0) {
				errors.put("livingArea", "living area cannot be zero or empty.");
			} else if (property.getLivingArea() < 0 || property.getLivingArea() > 999999999) {
				errors.put("livingArea", "living area field is invalid.");
			}
			
			// Validate the year built field.
			if (property.getYearBuilt() == 0) {
				errors.put("yearBuilt", "year built cannot be zero or empty.");
			} else if (property.getYearBuilt() < 0 || property.getYearBuilt() > 999999999) {
				errors.put("yearBuilt", "year built field is invalid.");
			}
			
			// Validate the total rooms field.
			if (property.getTotalRooms() == 0) {
				errors.put("totalRooms", "total rooms cannot be zero or empty.");
			} else if (property.getTotalRooms() < 0 || property.getTotalRooms() > 999999999) {
				errors.put("totalRooms", "total rooms field is invalid.");
			}
			
			// Validate the bedrooms field.
			if (property.getBedrooms() == 0) {
				errors.put("bedrooms", "bedrooms cannot be zero or empty.");
			} else if (property.getBedrooms() < 0 || property.getBedrooms() > 999999999) {
				errors.put("bedrooms", "bedrooms field is invalid.");
			}
			
			// Validate the tax year field.
			if (property.getTaxYear() == 0) {
				errors.put("taxYear", "tax year cannot be zero or empty.");
			} else if (property.getTaxYear() < 0 || property.getTaxYear() > 999999999) {
				errors.put("taxYear", "tax year field is invalid.");
			}
			
			// Validate the market value field.
			if (property.getMarketValue() == 0) {
				errors.put("marketValue", "market value cannot be zero or empty.");
			} else if (property.getMarketValue() < 0 || property.getMarketValue() > 999999999) {
				errors.put("marketValue", "market value field is invalid.");
			}
			
			// Validate the price sold field.
			if (property.getPriceSold() == 0) {
				errors.put("priceSold", "price sold cannot be zero or empty.");
			} else if (property.getPriceSold() < 0 || property.getPriceSold() > 999999999) {
				errors.put("priceSold", "price sold field is invalid.");
			}
			
			// Validate the price property type.
			if (property.getPropertyType().isEmpty()) {
				errors.put("propertytype", "The property type field is empty.");
			} else if (property.getPropertyType().length() > 12) {
				errors.put("propertytype", "The property type field must be less than 12 alphabets.");
			} else if (!property.getPropertyType().matches("[a-zA-Z]+")) {
				errors.put("propertytype", "The property type field must contain only alphabets.");
			}
			
			// Validate the flood zone field.
			if (!property.getFloodZone().equalsIgnoreCase("yes") && !property.getFloodZone().equalsIgnoreCase("no")) {
				errors.put("floodZone", "floodZone field is Invalid.");
			}
			return errors;
			
				
		 
	 }
			

	 }
