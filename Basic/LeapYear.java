package com.Basic;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
     System.out.println("Enter the laep year");
     int year=in.nextInt();
     if(year%400==0)
     {
    	 System.out.println(year+" is leap year");
     }
     else if(year%100==0)
     {
    	 System.out.println(year+" is leap year");
     }
     else if(year%4==0)
     {
    	 System.out.println(year+" is leap year");
     }
     else
     {
    	 System.out.println(year+" is  not leap year");
     }

	}

}
