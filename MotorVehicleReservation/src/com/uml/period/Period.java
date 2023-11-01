package com.uml.period;

import java.util.Date;

public class Period {
	
	private Date periodFrom;
	private Date periodTo;
	
	public Period() {
		System.out.println("Period");
	}

	public Date getPeriodFrom() {
		return periodFrom;
	}

	public void setPeriodFrom(Date periodFrom) {
		this.periodFrom = periodFrom;
	}

	public Date getPeriodTo() {
		return periodTo;
	}

	public void setPeriodTo(Date periodTo) {
		this.periodTo = periodTo;
	}
	

}
