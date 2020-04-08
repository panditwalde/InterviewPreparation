package com.Basic;

import java.util.Scanner;

public class HCFAndLCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int a,b,x,y,t,gcf,lcm;
		System.out.println("Enter Two Integers Number");
		x=in.nextInt();
		y=in.nextInt();
		a=x;
		b=y;
		while(b!=0)
		{
			t=b;
			b=a%b;
			a=t;
			
		}
       gcf=a;
       lcm=(x*y)/gcf;
       
       System.out.println("Greatest Common Divisor : "+gcf );
       System.out.println("Least Common Multiple "+lcm);
    		   
	}

}
