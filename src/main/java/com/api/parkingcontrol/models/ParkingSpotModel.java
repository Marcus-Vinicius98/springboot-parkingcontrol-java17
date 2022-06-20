package com.api.parkingcontrol.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "TB_PARKING_SPOT")
@Entity
public class ParkingSpotModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;

	@Column(nullable = false, unique = true, length = 10)
	private String parkingSpotNumber;

	@Column(nullable = false)
	private LocalDateTime registrationDate;

	@Column(nullable = false, length = 130)
	private String responsibleName;

	@Column(nullable = false, length = 30)
	private String apartment;

	@Column(nullable = false, length = 30)
	private String block;

	@OneToOne(mappedBy = "spotModel", cascade = CascadeType.ALL)
	private ParkingCarModel carModel;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getParkingSpotNumber() {
		return parkingSpotNumber;
	}

	public void setParkingSpotNumber(String parkingSpotNumber) {
		this.parkingSpotNumber = parkingSpotNumber;
	}

	public LocalDateTime getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getResponsibleName() {
		return responsibleName;
	}

	public void setResponsibleName(String responsibleName) {
		this.responsibleName = responsibleName;
	}

	public String getApartment() {
		return apartment;
	}

	public void setApartment(String apartment) {
		this.apartment = apartment;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	public ParkingCarModel getCarModel() {
		return carModel;
	}

	public void setCarModel(ParkingCarModel carModel) {
		this.carModel = carModel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
