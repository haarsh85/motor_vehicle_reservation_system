package com.uml.motorVehicle;

import com.uml.drivingLicense.CarLicense;

public class Van extends Truck{
	
	private CarLicense vanLicense;
	
	public Van() {
		System.out.println("Van");
	}

	public CarLicense getVanLicense() {
		return vanLicense;
	}

	public void setVanLicense(CarLicense vanLicense) {
		this.vanLicense = vanLicense;
	}
	
	

}
