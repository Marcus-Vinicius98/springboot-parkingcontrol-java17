package com.api.parkingcontrol.models;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "TB_PARKING_CAR")
@Entity
public class ParkingCarModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;

	@Column(nullable = false, unique = true, length = 7)
	private String licensePlateCar;

	@Column(nullable = false, length = 70)
	private String brandCar;

	@Column(nullable = false, length = 70)
	private String modelCar;

	@Column(nullable = false, unique = true, length = 70)
	private String colorCar;

	@OneToOne
	@MapsId
	private ParkingSpotModel spotModel;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getLicensePlateCar() {
		return licensePlateCar;
	}

	public void setLicensePlateCar(String licensePlateCar) {
		this.licensePlateCar = licensePlateCar;
	}

	public String getBrandCar() {
		return brandCar;
	}

	public void setBrandCar(String brandCar) {
		this.brandCar = brandCar;
	}

	public String getModelCar() {
		return modelCar;
	}

	public void setModelCar(String modelCar) {
		this.modelCar = modelCar;
	}

	public String getColorCar() {
		return colorCar;
	}

	public void setColorCar(String colorCar) {
		this.colorCar = colorCar;
	}

	public ParkingSpotModel getSpotModel() {
		return spotModel;
	}

	public void setSpotModel(ParkingSpotModel spotModel) {
		this.spotModel = spotModel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
