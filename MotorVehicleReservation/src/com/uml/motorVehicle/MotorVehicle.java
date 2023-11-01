package com.uml.motorVehicle;

import com.uml.rentalOffice.RentalOffice;

public class MotorVehicle {
	
	private RentalOffice rentalOffice;
	
	public MotorVehicle() {
		System.out.println("Motor Vehicle");
	}

	public RentalOffice getRentalOffice() {
		return rentalOffice;
	}

	public void setRentalOffice(RentalOffice rentalOffice) {
		this.rentalOffice = rentalOffice;
	}

	
}
