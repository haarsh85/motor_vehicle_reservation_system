package com.uml.contracts;

public class InsuranceContract {
	
	private RentalContract rentalContract;
	
	public InsuranceContract() {
		System.out.println("Insurance Contract");
	}
	
	public void sign() {
		System.out.println("Sign insurance contract");
	}
	
	public RentalContract getRentalContract() {
		return rentalContract;
	}


	public void setRentalContract(RentalContract rentalContract) {
		this.rentalContract = rentalContract;
	}

}
