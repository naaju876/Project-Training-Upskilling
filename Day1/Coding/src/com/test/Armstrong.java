package com.test;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		
		int n,r,sum=0,temp;
		System.out.println("Enter a Number");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		
		while(n!=0) {
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;	
		}	
		if(sum==temp) {
			System.out.println(temp + "is a Armstrong Number");
		}
			else {
			System.out.println(temp + "is not an Armstrong Number");
			} 
	}
}
