package com.String;

public class RemoveAllVowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="panditrakhmajiwalde".replaceAll("[AEIOUaeiou]", "");
		
		System.out.println("The String without Vowel");
		System.out.println(input);
		

	}

}
