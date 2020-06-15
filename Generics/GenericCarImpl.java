package com.generics;

public class GenericCarImpl {

	public static void main(String[] args) {

		 // Creating object of sub class C and  
        // passing it to Bound as a type parameter. 
		GenericCar<Honda> bec = new GenericCar<Honda>(new Honda()); 
        bec.doRunTest(); 
          
        // Creating object of sub class B and  
        // passing it to Bound as a type parameter. 
        GenericCar<Toyota> beb = new GenericCar<Toyota>(new Toyota()); 
        beb.doRunTest(); 
          
        // similarly passing super class A 
        GenericCar<Car> bea = new GenericCar<Car>(new Car()); 
        bea.doRunTest(); 
          
    } 
} 