package com.Array;

import java.util.Arrays;
import java.util.HashSet;

public class UnionOfTwoArray {
	
	static void union(String[]...a)
	{
		HashSet<String>hs=new HashSet<>();
		System.out.println("input Arrays");
		for(String[] s:a)
		{
			System.out.println(Arrays.toString(s));
			for(String i:s)
			{
				hs.add(i);
			}
		}
		System.out.println("Union of All Input Arrays");
		System.out.println(hs);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] inputArray1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
		  
        String[] inputArray2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
        union(inputArray1,inputArray2);

	}

}
