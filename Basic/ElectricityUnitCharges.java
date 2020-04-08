package com.Basic;

import java.util.Scanner;

public class ElectricityUnitCharges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in= new Scanner(System.in);
		int unit;
		float amt,totalamt,charges;
		System.out.println("Enter the unit");
		unit=in.nextInt();
		
		if(unit<=50)
		{
			amt=(float) (unit*0.50);
		}
		else if(unit<=150)
		{
			amt=(float) ((float) 25+((unit-50)*0.75));
		}
		else if(unit<=250)
		{
			amt=(float) ((float) 100+((unit-150)*1.20));
		}
		else 
		{
			amt=(float) ((float) 220+((unit-250)*1.50));
		}
		charges=(float) (amt*0.20);
		totalamt=amt+charges;
		
		System.out.println("Electricity Bill=Rs. "+totalamt);

	}

}
