package com.String;

import java.util.HashMap;

public class FirstRepeatedNonRepeatedchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<Character, Integer>hm=new HashMap<Character,Integer>();
		String input="panditp";
		char[] arr=input.toCharArray();
		for(char c:arr)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		for(char c:arr)
		{
			if(hm.get(c)==1)
			{
			   System.out.println("First  non Repeated Character In :"+input+"is : "+c+" ");
			   break;
			}
		}
		
		for(char c:arr)
		{
			if(hm.get(c)>1)
			{
			   System.out.println("First Repeated Character In :"+input +"is :"+c+" ");
			   break;
			}
		}

	}

}
