package com.thread;

public class InnterruptedThread extends Thread {

	@Override
	public void run() {
		System.out.println("InnterruptedThread run ");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Got Intertupted in catch ");
			e.printStackTrace();
		}
	}
	
	

}
