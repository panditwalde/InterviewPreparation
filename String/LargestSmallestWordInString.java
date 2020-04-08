package com.String;

public class LargestSmallestWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="i am pandit walded";
		
		String[] arr=str.split(" ");
		int i=0,max,min;
		min=Integer.MIN_VALUE;
		max=Integer.MAX_VALUE;
		String largest,Smallest;
		largest=Smallest="";
		for(i=0;i<arr.length;i++)
		{
			if(arr[i].length()<min)
			{
				Smallest=arr[i];
				min=arr[i].length();
			}
			if(arr[i].length()>max)
			{
				largest=arr[i];
				max=arr[i].length();
			}
		}
		System.out.println("largest word "+largest);
		System.out.println("smallest Word "+Smallest);

	}

}
