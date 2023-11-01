package com.uml.bill;

import com.uml.client.Client;

public class Bill {
	
	private Client client;
	
	public Bill() {
		System.out.println("Bill");
	}
	
	public void pay() {
		System.out.println("Pay the bill");
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}


}
