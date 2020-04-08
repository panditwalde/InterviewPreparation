package com.Basic;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n, i;
		System.out.println("Enter the number");
		n = in.nextInt();
		for (i = 0; i <=n; i++) {
			System.out.print(fibo(i) + " ");
		}
	}

	static int fibo(int n) {
		if (n == 0) {
			return 0;
		}
		 else if (n == 1) {
			return 1;
		}
		 else {return fibo((n-1) + (n-2));}
		
		

	}

}
