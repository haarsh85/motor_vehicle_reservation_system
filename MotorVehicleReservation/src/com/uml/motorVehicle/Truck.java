package com.uml.motorVehicle;

import drivingLicense.TruckLicense;

public class Truck extends MotorVehicle{
	
	private TruckLicense truckLicense;
	
	public Truck() {
		System.out.println("Truck");
	}

	public TruckLicense getTruckLicense() {
		return truckLicense;
	}

	public void setTruckLicense(TruckLicense truckLicense) {
		this.truckLicense = truckLicense;
	}
	
	
	
	
	

}
