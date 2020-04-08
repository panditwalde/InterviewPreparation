package com.String;

public class ReverseWordByWordlnString {
	
	public static void main(String[] args) {
		
		String[] str=" i am pandit walde".split(" ");
		String ans=" ";
		for(int i=str.length-1;i>=0;i--)
		{
			ans+=str[i]+" ";
			
		}
		System.out.println(ans.substring(0,ans.length()-1));
	}

}
