package com.String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class RepeatCharInString {
	
	 public static void main(String x[])
	 {
	HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
	
	
	String s="AAaaabbBBCCcc";
	
	char[] a=s.toCharArray();
	
	for(char c:a)
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
	Set ss=hm.keySet();
	Iterator i=ss.iterator();
	
	  while(i.hasNext())
	  {
		  Object key=i.next();
		  Object value=hm.get(key);
		  System.out.print(value+""+key);
	  }

	 }
}
