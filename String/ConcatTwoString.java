package com.String;

public class ConcatTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1="pandit",s2="walde";
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
		int i,j=0,len=0;
		for(i=0;i<s1.length();i++)
		{
			len++;
		}
		for(j=len;j<s2.length();i++)
		{
			c1[i]=c2[j];
			j++;
		}
		
		
		System.out.println(c1);
		

	}

}
