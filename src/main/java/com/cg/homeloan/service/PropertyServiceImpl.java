package com.cg.homeloan.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.homeloan.entity.Property;
import com.cg.homeloan.repository.IPropertyRepository;
import com.cg.homeloan.validations.PropertyValidators;

@Service
public class PropertyServiceImpl implements IPropertyService {
 
	
	@Autowired
	IPropertyRepository propertyRepository;
	
	@Override
	public Property addProperty(Property property) throws Exception {
		
		PropertyValidators propertyValidators = new PropertyValidators();
		Map<String, String > errors = propertyValidators.validate(property);
		
		if (!errors.isEmpty()) {
			for (String fieldName : errors.keySet()) {
				System.err.println(errors.get(fieldName));
			}
			return null;
		}
		
		return propertyRepository.save(property);
	}
	
	@Override
	public Property getPropertyByHomeName(String homeName) {
		return IPropertyRepository.getPropertyByHomeName(homeName);
	}

}
