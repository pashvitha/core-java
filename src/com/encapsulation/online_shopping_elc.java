package com.encapsulation;
import java.util.*;
public class online_shopping_elc { 
	public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);

        online_shopping_blc obj=new online_shopping_blc(101, "Mobile", 15000, 5);
        online_shopping_blc obj1=new online_shopping_blc(102, "Laptop", 50000, 3);
        obj.setQuantity(10);
        System.out.println("product1");
        System.out.println("productid"+ obj.getProductid());
        System.out.println("productname"+ obj.getProducctname());
        System.out.println("price"+ obj.getPrice());
        System.out.println("quatity"+ obj.getQuantity()); 

        System.out.println("product2");
        System.out.println("productid"+ obj1.getProductid());
        System.out.println("productname"+ obj1.getProducctname());
        System.out.println("price"+ obj1.getPrice());
        System.out.println("quatity"+ obj1.getQuantity());


    }
	    


}
