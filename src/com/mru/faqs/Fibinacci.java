package com.mru.faqs;

import java.util.Scanner;

public class Fibinacci {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number of fib series");
		int n = scanner.nextInt();
		int[] fib = new int[n];
		
		fib[0] = 0;
		fib[1] = 1;
		
		for(int i=2;i<fib.length;i++) {
			fib[i] = fib[i-1]+fib[i-2];
		}
		
		System.out.println(fib[0]+" "+fib[1]+" ");
		for(int element:fib) {
			System.out.print(element+" ");
		}
	}

}