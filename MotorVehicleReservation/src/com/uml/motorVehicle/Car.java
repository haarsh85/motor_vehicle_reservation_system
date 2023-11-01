package com.uml.motorVehicle;

import com.uml.drivingLicense.CarLicense;

public class Car extends MotorVehicle{
	
	private CarLicense carLicense;
	
	public Car() {
		System.out.println("Car");
	}

	public CarLicense getCarLicense() {
		return carLicense;
	}

	public void setCarLicense(CarLicense carLicense) {
		this.carLicense = carLicense;
	}
	
	

}
