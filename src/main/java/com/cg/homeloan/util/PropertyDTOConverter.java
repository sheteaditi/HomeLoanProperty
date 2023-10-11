package com.cg.homeloan.util;

import org.springframework.stereotype.Component;

import com.cg.homeloan.dto.PropertyDTO;
import com.cg.homeloan.dto.PropertyResponseDTO;
import com.cg.homeloan.entity.Property;

@Component
public class PropertyDTOConverter {
	
	public PropertyResponseDTO convertTo (Property property) {
		PropertyResponseDTO dto = new PropertyResponseDTO();
		dto.setPrice(property.getPrice());
		dto.setHomeName(property.getHomeName());
		dto.setHomeCity(property.getHomeCity());
		dto.setDescription(property.getDescription());
		dto.setRating(property.getRating());
		dto.setLocation(property.getLocation());
		dto.setFtName(property.getFtName());
		dto.setLtName(property.getLtName());
		dto.setPhoneNumber(property.getPhoneNumber());
		dto.setMailId(property.getMailId());
		dto.setLivingArea(property.getLivingArea());
		dto.setYearBuilt(property.getYearBuilt());
		dto.setTotalRooms(property.getTotalRooms());
		dto.setBedrooms(property.getBedrooms());
		dto.setIncludes(property.getIncludes());
		dto.setTaxYear(property.getTaxYear());
		dto.setFloodZone(property.getFloodZone());
		dto.setPropertyType(property.getPropertyType());
		dto.setDate(property.getDate());
		dto.setMarketValue(property.getMarketValue());
		dto.setPriceSold(property.getPriceSold());
		dto.setChange(property.getChange());
		dto.setSource(property.getSource());
		dto.setMore(property.getMore());
		
		dto.setMessage("propery Details Submitted");
		return dto;
		
	}
	
	public PropertyDTO getPropertyDTO (Property property) {
		
		return new PropertyDTO(property.getPrice(), property.getHomeName(), property.getHomeCity(), property.getDescription(),
				property.getRating(), property.getLocation(), property.getFtName(), property.getLtName(), property.getPhoneNumber(),
				property.getMailId(), property.getLivingArea(), property.getYearBuilt(), property.getTotalRooms(), property.getBedrooms(),
				property.getIncludes(), property.getTaxYear(), property.getFloodZone(), property.getPropertyType(), property.getDate(),
				property.getMarketValue(), property.getPriceSold(), property.getChange(), property.getSource(), property.getMore());
		
	}

}
