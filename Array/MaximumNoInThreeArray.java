package com.Array;

import java.util.Arrays;

public class MaximumNoInThreeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {12, 34, 20, 78, 56, 67, 52};
		int[] B = {50};
		int[] C = {1, 9, 51, 9};
		
Arrays.sort(A);
Arrays.sort(B);
Arrays.sort(C);
int Max=B[B.length-1]>=C[C.length-1]?B[B.length-1]:C[C.length-1];
int X=Max;
for (int i:A)
{
if (i>Max)
{Max=i;
break;
}
}
if (Max==X)
System.out.println("Doesnot exist!");
else
System.out.println(Max);
}


	}


