package com.inheritance;

import java.util.Scanner;
public class food_delivery_elc { 
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("-- take userinput --");
		System.out.println("enter userid");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name");
		String name=sc.nextLine(); 
		
		System.out.println("enter address");
		String add=sc.nextLine();
		
		System.out.println("enter discount");
		double dis=sc.nextDouble();
		sc.nextLine();
		
		System.out.println("enter vehicle type");
		String vehicle=sc.nextLine();
		
//		Food_delivery_blc obj=new Food_delivery_blc(id,name);
		
		Customer obj1=new Customer(add,id,name); 
		PremiumCustomer obj2=new PremiumCustomer(dis,add,id,name); 
		deliverypartner obj3=new deliverypartner(vehicle,id,name); 
		admin obj4=new admin(id,name);
		
		int op;
		do {
			System.out.println("1 show costomer details");
			System.out.println("2 calculate bill");
			System.out.println("3 delivery order");
			System.out.println("4 admin add user");
			System.out.println("5 exit"); 
			
			System.out.println("enter option");
			op=sc.nextInt();
			
			switch(op) { 
				case 1:
//					System.out.println("show details");
					obj1.showCustomerDetails();
					break;
				
				
				
				case 2:
//					System.out.println("bill calculate");
					System.out.println("Enter bill amount:");
					double amount=sc.nextDouble();
					obj2.calculateBill(amount);
					break; 
				
				case 3:
//					System.out.println("delivery order");
					obj3.deliverorder();
					break;
				case 4:
//					System.out.println("add")
					obj4.adduser();
					break;
				case 5:
					System.out.println("thankyou");
					break;
				default:
	                System.out.println("Invalid option");
			}
				
			
		} while(op!=5);
	}

}
