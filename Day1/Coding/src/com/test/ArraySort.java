package com.test;

import java.util.Scanner;

public class ArraySort {
	
		  public static void main(String args[])
		  {
		    int a[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		    Scanner s =new Scanner(System.in);
		    System.out.println("Enter Searcing value");
		    int Key=s.nextInt();
		    for(int i=0;i<15;i++)
		    {
		      if(Key==a[i])
		      {
		        System.out.println(Key+" is found at index"+i);
		      }
		    }
		  }
		}


