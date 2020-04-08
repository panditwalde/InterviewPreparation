


package com.String;

import java.util.Arrays;

public class StringLength {
	
	public static void main(String[] args) {
		
	
	
	int len=0;
	
	String s="panditwalde";
	
	
	String rev=" "; 
	int count=0;
	 char[] c=s.toCharArray();
	for(int i=s.length()-1;i>=0;i--)
		
	{  count++;
		rev+=c[i];
	}

	System.out.println("Total Word in String:"+count);
	System.out.println("String Reverse: "+rev);
	
	}
}
