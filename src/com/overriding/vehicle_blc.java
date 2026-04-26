package com.overriding;

public class vehicle_blc { 
	public static void main(String[] args) { 
//		vehicle_elc[] v= {new car(),new motorcycle()};
//		for(vehicle_elc obj:v) {
//			obj.sound();
//			System.out.println(obj.description());
//		} 
		vehicle_elc obj1=new car();
		obj1.sound();
		System.out.println(obj1.description());
		
		vehicle_elc obj2=new motorcycle();
		obj2.sound();
		System.out.println(obj2.description());
		
		
		

	}


}
