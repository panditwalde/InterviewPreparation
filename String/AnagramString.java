package com.String;

import java.util.Arrays;

public class AnagramString {
	
	
	public static boolean  anagram(String s1,String s2)
	{
		
		if(s1.length()!=s2.length())
		{
			return false;
		}
		
		char[] a=s1.toCharArray();
     	char[] b=s2.toCharArray();
     	Arrays.sort(a);
		Arrays.sort(b);
		return Arrays.equals(a, b);
	}

	public static void main(String[] args) {
	
		
		System.out.println("This is Anagram: "+anagram("abcde","edcba"));

	}

}
