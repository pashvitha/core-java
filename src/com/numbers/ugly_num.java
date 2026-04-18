package com.numbers;

import java.util.*;
public class ugly_num { 
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter number");
		int n=sc.nextInt();
		if(n<=0) {
			System.out.println("no");
			
		}
		int[] primes= {2,3,5};
		for(int p:primes) {
			if(n%p==0) {
				n=n/p;
			}
		}
		if(n==1) {
			System.out.println("ugly num");
		}
		else {
			System.out.println("no ");
		}
	}

}


