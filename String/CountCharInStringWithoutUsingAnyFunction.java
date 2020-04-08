package com.String;

import java.util.Scanner;

public class CountCharInStringWithoutUsingAnyFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		String str;
		 int a[]=new int[256];
		 System.out.println("Enter the String");
		 str=in.nextLine();
		 
		 for(int i=0;i<str.length();i++)
		 {
			 if(str.charAt(i)==' ')
			 {
			    continue;
			 }
			 a[str.charAt(i)]++;
		 }
		 for(int i=65;i<90;i++)
		 {
			 a[i]=a[i]+a[i+32];
			 a[i+32]=0;
		 }
		 for(int i=0;i<256;i++)
		 {
			 if(a[i]>1)
			 {
				 System.out.println((char)i+" : "+a[i]);
			 }
		 }
		 

	}

}
