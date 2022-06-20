package com.api.parkingcontrol.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.parkingcontrol.models.ParkingCarModel;

@Repository
public interface ParkingCarRepository extends JpaRepository<ParkingCarModel, UUID> {

}
