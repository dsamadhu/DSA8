package com.mru.loops;

public class Loops {

	public static void main(String[] args) {
		
		int[] arr1 = {10,20,30,40,50};
		int e1 = arr1[0];
		System.out.println(e1);
		
		
		//find number of elements
		int n = arr1.length;
		System.out.println(n);
		
		
		//for loop
		for(int i=0;i<n;i++) {
			System.out.println(arr1[i]);
		}
		
		
		//while loop
		int x = 0;
		while(x<n) {
			System.out.println(arr1[x]);
			x++;
		}
		
		//do while loop
		int y=0;
		do {
			System.out.println(arr1[y]);
			y++;
		}while(y<n);
		
		//forEach() loop
		for(int element:arr1) {
			System.out.println(element);
		}
		
		
		
		
		
		
	}

}