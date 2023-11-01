package com.uml.drivingLicense;

import com.uml.client.Client;

public class DrivingLicense {
	
	private Client client;
	
	public DrivingLicense() {
		System.out.println("Driving License");
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	

}
