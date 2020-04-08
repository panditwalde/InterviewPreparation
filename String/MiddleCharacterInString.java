package com.String;

import java.util.Scanner;

public class MiddleCharacterInString {
	
	public static String middle(String name)
	{
		int pos,len;
		if(name.length()%2==0)
		{
			pos=name.length()/2-1;
			len=2;
		}
		else {pos=name.length()/2;
		      len=1;
		     }
		return name.substring(pos, pos+len);
	}
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		String name;
		System.out.println("Enter the Any String");
		name=in.nextLine();
		
		System.out.println("The middle character in the string: "+middle(name));
		
		
	}

}
