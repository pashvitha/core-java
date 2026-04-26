package com.overriding;

public class vehicle_elc { 
	public void sound() {
		System.out.println("The vehicle makes a sound.");
	} 
	public String description() {
		return "it vehicle";
		
	}

}

class car extends vehicle_elc{  
	@Override
	public void sound() {
		System.out.println("The car honks.");
	}
	public String description() {
		return "it car";
		
	}
	
}
class motorcycle extends vehicle_elc{ 
	@Override
	public void sound() {
		System.out.println("The motorcycle beeps.");
	} 
	public String description() {
		return "it motorcycle";
		
	}
	
}
