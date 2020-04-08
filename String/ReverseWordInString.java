package com.String;

public class ReverseWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String word="pandit rakhmaji walde";
		String reverse="";
		for(int i=word.length()-1;i>0;i--)
		{
			reverse+=word.charAt(i);
			
		}
		System.out.println("Reverse Word: "+reverse);

	}

}
