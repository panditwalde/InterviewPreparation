package com.String;

public class MiddleWordReverse {
	
	static void printreverse(String str)
	{
		int i=0;
		//first word
		for(i=0;i<str.length()&& str.charAt(i)!=' ';i++)
			
		{
			System.out.print(str.charAt(i));
		}
		String word=" ";
		//secord word
		for(;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				word+=str.charAt(i);
			}
			else
			{
				System.out.print(new StringBuilder(word).reverse().toString()+" ");
			}
		}
		System.out.print(word+" ");
		
		
	}
	public static void main(String[] args) {
		
		String str=" I pandit walde";
		printreverse(str);
	}

}
