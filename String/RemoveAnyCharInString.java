package com.String;

import java.util.Scanner;

public class RemoveAnyCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the any");
		String str=in.next(),k="";
		System.out.println("Enter the which one want remove above String");
		String a=in.next();
		char z ;
		for(int i=0;i<str.length();i++)
		{
			z=str.charAt(i);
		
		if(z=='a')
		{
			
		}
		else
		{
			k+=z;
		}
		}
		System.out.println("Number Without zero "+k);

	}

}
