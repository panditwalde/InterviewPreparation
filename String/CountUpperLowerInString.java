package com.String;

public class CountUpperLowerInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="PanditRakhmajiWalde";
		char[] word=str.toCharArray();
		int u = 0,l = 0,i;
		for(i=0;i<str.length();i++)
		{
		  	if(word[i]>='A' && word[i]<='Z')
		  	{
		  		u++;
		  	}
		  	if(word[i]>='a' && word[i]<='z')
		  	{
		  		l++;
		  	}
		  	
		}
		System.out.println("UpperCase Letters: "+u);
		System.out.println("LowerCase Letters: "+l);

	}
	

}
