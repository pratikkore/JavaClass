package AugastWrritenTest;

import java.util.TreeSet;

//10)Write a program to merge two sorted array of number such 
//that new array is sorted array and there should be no duplicate in new array

public class Problem10 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 7, 8 };
		int[] arr2 = { 1, 6, 2, 4, 5, 7, 8 };

		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				ts.add(arr1[i]);
				ts.add(arr2[j]);
			}

		}
		System.out.println(ts);
	}
}
