package com.encapsulation;

public class blc_bankapp { 
	 private String customer_name;
	    private String customer_Address;
	    private long phn_num;
	    private double balance;

	    blc_bankapp(String customer_name,String customer_address,long phn_num,double balance) {
	        this.customer_name=customer_name;
	        this.customer_Address=customer_address;
	        this.phn_num=phn_num;
	        this.balance=balance;
	        System.out.println("Account created sucessfully"); 

	    } 

	    public String getCustomer_name(){
	        return customer_name;
	    } 

	    public String getCustomer_Address(){
	        return customer_Address;
	    }
	    public long getPhn_num(){
	        return phn_num;


	    }
	    public double getBalance(){
	        return balance;
	    }
	    
	    public void setCustomer_name(String customer_name){
	        this.customer_name=customer_name;
	    } 

	    public void setCustomer_Address(String customer_address){
	        this.customer_Address=customer_address;
	    }  

	    public void setPhn_num(long phn_num){
	        this.phn_num=phn_num;
	    } 

	    public void setBalance(double balance){
	        this.balance=balance;

	    }
	    public void deposit(double amount){
	        if(amount<=0){
	            System.out.println("enter valid amount");
	        }
	        else{
	            balance+=amount;
	            System.out.println("available balance"+balance);
	        }
	    } 

	    public void withdraw(double amount){
	        if(amount <= 0){
	            System.out.println("Invalid withdrawal amount");
	        }
	        else if(amount > balance){
	            System.out.println("Insufficient funds");
	        }
	        else{
	            balance-=amount;
	            System.out.println("Available balance "+balance);
	        }
	    }

	    public void showbalance(){
	        System.out.println(balance);
	    }

}
