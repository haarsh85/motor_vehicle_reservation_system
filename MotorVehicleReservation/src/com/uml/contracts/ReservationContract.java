package com.uml.contracts;

import com.uml.client.Client;
import com.uml.rentalOffice.RentalOffice;

public class ReservationContract {
	
	private RentalOffice rentalOffice;
	private Client client;
	
	public ReservationContract() {
		System.out.println("Reservation Contract");
	}
	
	public void sign() {
		System.out.println("Sign reservation contract");
	}
	
	public void cancel() {
		System.out.println("cancel reservation contract");
	}
	
	
	public RentalOffice getRentalOffice() {
		return rentalOffice;
	}

	public void setRentalOffice(RentalOffice rentalOffice) {
		this.rentalOffice = rentalOffice;
	}



	public Client getClient() {
		return client;
	}



	public void setClient(Client client) {
		this.client = client;
	}

}
