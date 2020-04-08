package com.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RepeatWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in= new Scanner(System.in);
		String n;
		int i;
		System.out.println("Enter the String");
		n=in.nextLine();
		
		String[] word=n.split(" ");
		Map<String, Integer>map= new HashMap<String, Integer>();
		
		for(String str:word)
		{
			if(map.containsKey(str))
			{
				map.put(str, map.get(str)+1);
				
			}
			else
			{
				map.put(str, 1);
			}
			
		}
		Set<String> set=map.keySet();
		for(String str:set)
		{
			System.out.println("word: "+str+":Repeated "+map.get(str)+"time");
		}
	}
	
	

}
