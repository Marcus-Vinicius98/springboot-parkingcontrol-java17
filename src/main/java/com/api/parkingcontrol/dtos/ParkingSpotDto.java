package com.api.parkingcontrol.dtos;

import javax.validation.constraints.NotBlank;

public class ParkingSpotDto {
	
	@NotBlank
	private String parkingSpotNumber;
	
	@NotBlank
	private String responsibleName;
	
	@NotBlank
	private String apartment;
	
	@NotBlank
	private String block;

}
