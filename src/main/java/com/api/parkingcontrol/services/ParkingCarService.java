package com.api.parkingcontrol.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.parkingcontrol.repositories.ParkingCarRepository;

@Service
public class ParkingCarService {

	@Autowired
	private ParkingCarRepository carRepository;
}
