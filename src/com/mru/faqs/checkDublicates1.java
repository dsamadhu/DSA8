package com.mru.faqs;

import java.util.HashSet;

public class checkDublicates1 {

	private static boolean flag;

	public static void main(String[] args) {
		int arr[] = {1,2,3,1,2,3};
		HashSet<Integer>set=new HashSet<>();
		for(int element:arr) {
			if(set.contains(element)) {
				System.out.println("Duplicate are found");
				break;
			}
			else {
				set.add(element);
			}
		}
		boolean ;
		System.out.println(flag ? "Duplicate are found" : "Duplicates Not Found");

	}

}
