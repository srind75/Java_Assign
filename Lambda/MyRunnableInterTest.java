package com.functional.lambda;

public class MyRunnableInterTest {

	public static void main(String[] args) {

	/*	
	 	Runnable r = new MyRunnaableImpl();
		Thread t = new Thread(r);
		t.start();
*/

		Runnable r = () ->{
			
			for(int i =1; i <=10; i++) {
				System.out.println("Child Thread");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		
		for(int i =1; i <=10; i++) {
			System.out.println("Main Thread");
		}
		

	}

}
