package com.staticmethods;

public class emp_salary_update { 
	 static int basic=20000;
	    static int bonus=5000;

	    public static void calculate_salary(){
	        int total=basic+bonus;
	        System.out.println("total is"+total);
	    } 

	    public static void main(String[] args) {
	        calculate_salary();
	    }

}
