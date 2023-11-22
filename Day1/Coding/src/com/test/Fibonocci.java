package com.test;

import java.util.Scanner;

public class Fibonocci {
	public static void main(String args[]) {
		
		int a=0,b=1,c,i;
//		Scanner scan=new Scanner(System.in);
//		int n= scan .nextInt();
//		scan.close();
		System.out.print(a+" "+b);
        for(i=2;i<=10;i++) {
        	c=a+b;
        	System.out.print(" "+c);
        	a=b; 
        	b=c;
        } 
		
		
	}

}
