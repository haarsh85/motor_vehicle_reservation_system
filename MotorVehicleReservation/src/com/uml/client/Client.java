package com.uml.client;

import java.util.ArrayList;

import com.uml.bill.Bill;
import com.uml.contracts.RentalContract;
import com.uml.contracts.ReservationContract;
import com.uml.drivingLicense.DrivingLicense;
import com.uml.rentalOffice.RentalOffice;

public class Client {
	
	private ArrayList<Bill> bills;
	private ArrayList<ReservationContract> resContract;
	private ArrayList<DrivingLicense> drivingLicense;
	private ArrayList<RentalContract> rentalContract;
	private RentalOffice rentalOffice;
	
	public Client() { 
		System.out.println("Client");
	}

	public ArrayList<Bill> getBills() {
		return bills;
	}

	public void setBills(ArrayList<Bill> bills) {
		this.bills = bills;
	}

	public ArrayList<ReservationContract> getResContract() {
		return resContract;
	}

	public void setResContract(ArrayList<ReservationContract> resContract) {
		this.resContract = resContract;
	}

	public ArrayList<DrivingLicense> getDrivingLicense() {
		return drivingLicense;
	}

	public void setDrivingLicense(ArrayList<DrivingLicense> drivingLicense) {
		this.drivingLicense = drivingLicense;
	}

	public ArrayList<RentalContract> getRentalContract() {
		return rentalContract;
	}

	public void setRentalContract(ArrayList<RentalContract> rentalContract) {
		this.rentalContract = rentalContract;
	}

	public RentalOffice getRentalOffice() {
		return rentalOffice;
	}

	public void setRentalOffice(RentalOffice rentalOffice) {
		this.rentalOffice = rentalOffice;
	}
	
	

}
