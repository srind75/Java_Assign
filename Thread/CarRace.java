package com.thread;

public class CarRace {
	private String status;
	//private int speed;
	
	public CarRace(){}
	
	public CarRace(String status){
	     this.setStatus(status);
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
}
