package com.Overriding;

public class vehicle_elc {
	 public static void main(String[] args) {

		 vehicle_blc[] vehicles = new vehicle_blc[2];

	        vehicles[0] = new Car();
	        vehicles[1] = new Motorcycle();

	        for (vehicle_blc v : vehicles) {
	            v.sound(); // dynamic method dispatch
	            System.out.println(v.description());
	            System.out.println();
	        }
	    }
} 
