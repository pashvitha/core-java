package com.inheritance;

public class Food_delivery_blc { 
	int userid;
	String name;
	Food_delivery_blc(int userid,String name){ 
		this.userid=userid;
		this.name=name;
		System.out.println("user account created sucessfully");
		
	}   
	
	public void showUserDetails() { 
		System.out.println(userid);
		System.out.println(name);
		
	}
}  

class Customer extends Food_delivery_blc { 
	String address;
	
	Customer(String address,int userid,String name){  
		super(userid,name);
		this.address=address;  	
	} 
	public void showCustomerDetails() {
		super.showUserDetails();
		System.out.println(address);
	} 
}  


class PremiumCustomer extends Customer{
	double discount;
	PremiumCustomer (double discount,String address,int userid,String name){
		super(address,userid,name);
		this.discount=discount;
	} 
	
	public void calculateBill(double amount) {
		if(discount>50) {
			System.out.println("invalid discount");
		} 
		else if(amount<=0) {
			System.out.println("invalid amount"); 
		}
		else {
			double finalAmount = amount - (amount * discount / 100);
			System.out.println("Final bill after discount: " + finalAmount);
		}
	}
} 

class deliverypartner extends Food_delivery_blc{
	String vehicletype;
	deliverypartner(String vehicletype,int userid,String name){
		super(userid,name);
		this.vehicletype=vehicletype;
		
		
	} 
	public void deliverorder(){
		System.out.println("Order delivered using " + vehicletype);
		
	}
	
} 

class Manager extends Food_delivery_blc {

    Manager(int userid, String name){
        super(userid, name);
    }

    public void monitorSystem(){
        System.out.println("System is being monitored by manager");
    }
}
 

class admin extends Food_delivery_blc{ 
	admin(int userid,String name){ 
		super(userid,name);
		
	}
	
	public void adduser() { 
		System.out.println("new user added sucessfully");
		
	}
}

