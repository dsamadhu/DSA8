
package com.mru.faqs;
import java.util.HashSet;

public class DuplicateElements {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 1, 4, 1, 2, 5};

        HashSet<Integer> set = new HashSet<>();
        System.out.println("Duplicate elements are: ");

        for (int element : arr) {
            if (!set.add(element)) {
                System.out.println(element);
            }
        }
    }

}