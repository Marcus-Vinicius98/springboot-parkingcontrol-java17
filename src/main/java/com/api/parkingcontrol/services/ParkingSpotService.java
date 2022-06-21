package com.api.parkingcontrol.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;

@Service
public class ParkingSpotService {

	@Autowired
	private ParkingSpotRepository spotRepository;

	@Transactional
	public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
		return spotRepository.save(parkingSpotModel);
	}

	
}
