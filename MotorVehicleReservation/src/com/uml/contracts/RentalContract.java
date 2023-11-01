package com.uml.contracts;

import com.uml.client.Client;

public class RentalContract {
	
	private Client client;
	private InsuranceContract insContract;
	
	public RentalContract() {
		System.out.println("Rental Contract");
	}
	

	public void sign() {
		System.out.println("Sign rental contract");
	}

	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public InsuranceContract getInsContract() {
		return insContract;
	}


	public void setInsContract(InsuranceContract insContract) {
		this.insContract = insContract;
	}


}
