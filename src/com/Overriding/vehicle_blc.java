package com.Overriding;

public class vehicle_blc { 
	public void sound() {
        System.out.println("The vehicle makes a sound.");
    }

    public String description() {
        return "This is a generic vehicle.";
    }

}

class Car extends vehicle_blc {

    @Override
    public void sound() {
        System.out.println("The car honks.");
    }

    @Override
    public String description() {
        return "This is a car with four wheels.";
    }
}
class Motorcycle extends vehicle_blc {

    @Override
    public void sound() {
        System.out.println("The motorcycle beeps.");
    }

    @Override
    public String description() {
        return "This is a motorcycle with two wheels.";
    }
}