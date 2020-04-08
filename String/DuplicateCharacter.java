package com.String;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	String input=new String("abbc");
		String output=new String();
		for(int i=0;i<input.length();i++)
		{
			for(int j=0;i<output.length();j++)
			{
				if(input.charAt(i)!=output.charAt(j))
				{
					output+=input.charAt(i);
				}
			}
		}
		System.out.println("www"+output);*/
		
          String s="aaabbbddeeeff";
          Set<Character>set=new LinkedHashSet<Character>();
          for(char c:s.toCharArray())
          {
        	  set.add(Character.valueOf(c));
          }
          System.out.println(set);
	}

}
