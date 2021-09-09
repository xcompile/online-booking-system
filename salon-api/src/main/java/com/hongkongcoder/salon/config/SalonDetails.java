package com.hongkongcoder.salon.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Configuration
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SalonDetails {

	
	@Value("${salon.name}")
	private String name;
	
	@Value("${salon.address}")
	private String address;
	
	@Value("${salon.city}")
	private String city;
	
	@Value("${salon.state}")
	private String state;
	
	@Value("${salon.zipcode}")
	private String zipcode;
	
	@Value("${salon.phone}")
	private String phone;
	
	
	public SalonDetails clone() {
		final SalonDetails salonDetails  = new SalonDetails();
		
		salonDetails.name = name;
		salonDetails.address= address;
		salonDetails.city = city;
		salonDetails.state = state;
		salonDetails.zipcode= zipcode;
		salonDetails.phone = phone;
		
		return salonDetails;
		
		
	}
	
}
