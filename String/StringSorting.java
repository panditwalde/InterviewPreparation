package com.String;

import java.util.ArrayList;
import java.util.*;

public class StringSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number you want");
		int n = in.nextInt();
		String name[]=new String[n];
		System.out.println("Enter the names");		
		for(int i=0;i<n;i++)
		{
			name[i]=in.nextLine();
		}
			
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(name[i].compareTo(name[j])>0)
				{
					 String tmp = name[i];
					 name[i]=name[j];
					 name[j]=tmp;
				}
			}
		}
		System.out.println("Names in Sorted Order");
		for(int i=0;i<n-1;i++)
		{
			System.out.print(name[i]+" ");
		}
		System.out.print(name[n-1]);
	}

}
