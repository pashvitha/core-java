
package com.encapsulation;
import java.util.*;
public class elc_bankapp { 
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter address: ");
        String address = sc.nextLine();

        System.out.print("Enter phone number: ");
        long phone = sc.nextLong();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        // Create object
        blc_bankapp obj = new blc_bankapp(name, address, phone, balance);

        int option;

        do {
            System.out.println("\n**** MENU ****");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");

            System.out.print("Enter option: ");
            option = sc.nextInt();

            switch(option) {

                case 1:
                    System.out.print("Enter withdrawal amount: ");
                    double w = sc.nextDouble();
                    obj.withdraw(w);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double d = sc.nextDouble();
                    obj.deposit(d);
                    break;
                
                case 3:
                    // Using getter here
                    // System.out.println("Balance is: " + obj.getBalance()); 
                    System.out.println("balance"+obj.getBalance());
                    break;
                
                case 4:
                    System.out.println("Thank You!");
                    break;
                
                default:
                    System.out.println("Invalid option");
            }
                
        } while(option != 4);
    }

}
