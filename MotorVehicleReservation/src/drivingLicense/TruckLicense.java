package drivingLicense;

import com.uml.motorVehicle.Truck;

public class TruckLicense extends DrivingLicense{
	
	private Truck truck;

	public TruckLicense() {
		System.out.println("Truck License");
	}

	public Truck getTruck() {
		return truck;
	}

	public void setTruck(Truck truck) {
		this.truck = truck;
	}
	
}
