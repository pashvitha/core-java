package com.overriding;

public class mainapp {

	public static void main(String[] args) { 
//		vehicle[] v= {new car(),new motorcycle()};
//		for(vehicle obj:v) {
//			obj.sound();
//			System.out.println(obj.description());
//		} 
		vehicle obj1=new car();
		obj1.sound();
		System.out.println(obj1.description());
		
		vehicle obj2=new motorcycle();
		obj2.sound();
		System.out.println(obj2.description());
		
		
		

	}

}
