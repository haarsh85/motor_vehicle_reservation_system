package com.uml.rentalOffice;

import java.util.ArrayList;

import com.uml.category.Category;
import com.uml.client.Client;
import com.uml.contracts.ReservationContract;
import com.uml.motorVehicle.MotorVehicle;
import com.uml.period.Period;

public class RentalOffice {
	
	private ArrayList<ReservationContract> resContract;
	private ArrayList<Client> clients;
	private Period period;
	private Category category;
	private ArrayList<MotorVehicle> motorVehicle;
	
	public RentalOffice() {
		System.out.println("Rental Office");
	}
	
	public void reserve (Category categoty, Period period) {
		System.out.println("Reserve vehicle");
	}
	
	public void fetch() {
		System.out.println("Fetch vehicle");
	}
	
	public MotorVehicle returnVehicle (MotorVehicle motorVehicle) {
		System.out.println("Return vehicle");
		return motorVehicle;
		
	}

	public ArrayList<ReservationContract> getResContract() {
		return resContract;
	}

	public void setResContract(ArrayList<ReservationContract> resContract) {
		this.resContract = resContract;
	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public ArrayList<MotorVehicle> getMotorVehicle() {
		return motorVehicle;
	}

	public void setMotorVehicle(ArrayList<MotorVehicle> motorVehicle) {
		this.motorVehicle = motorVehicle;
	}
	
	

}
