package com.numbers;

import java.util.*;
public class perfect_num { 
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n/2;i++) { 
			if(n%i==0) {
				sum+=i;
			}
			
		}
		if(sum==n) { 
			System.out.println(+n+"is perfect num");
			
			
		} 
		else {
			System.out.println(+n+"is not perfect num");
			
		}
		
	}

}
