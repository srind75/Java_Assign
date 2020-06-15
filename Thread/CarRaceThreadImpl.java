package com.thread;

import java.lang.reflect.Method;

public class CarRaceThreadImpl  extends Thread {
	CarRace carRace;
	
	
	
	public CarRaceThreadImpl(CarRace carRace) {
		//super();
		this.carRace = carRace;
	}

	public void run() {
		//System.out.println( " run Method  ............");
		System.out.println("Thread Name  start  : "+Thread.currentThread().getName());
		
	    //go();
	    try {
	        Thread.sleep(10);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    System.out.println("Thread Name  end   : "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		CarRace ch1 = new CarRace("Player1");
		CarRace ch2 = new CarRace("Player2");
		CarRace ch3 = new CarRace("Player3");
		CarRace ch4 = new CarRace("Player3");
		
		CarRaceThreadImpl crtH1 =new CarRaceThreadImpl(ch1);					
		CarRaceThreadImpl crtH2 =new CarRaceThreadImpl(ch2);
		CarRaceThreadImpl crtH3 =new CarRaceThreadImpl(ch3);
		CarRaceThreadImpl crtH4 =new CarRaceThreadImpl(ch3);
		crtH1.setPriority(MAX_PRIORITY);
		crtH2.setPriority(MIN_PRIORITY);
		crtH3.setPriority(3);
		crtH3.setPriority(6);
		crtH1.setName("Player1");
		crtH2.setName("Player2");
		crtH3.setName("Player3");
		crtH4.setName("Player4");
		crtH1.start();
		
		  try { System.out.println( " INside JOin Method  ............"); crtH1.join();
		  } catch (InterruptedException e) { e.printStackTrace(); }
		 
		crtH2.start();
		crtH3.start();
		crtH4.start();
		crtH4.interrupt();
		System.out.println("Thread Name  :  "+crtH1.getName());
		System.out.println("Thread Priority  :  "+crtH1.getPriority());
	//	System.out.println( " Start Method  ............");
		

	}

}
