package AugastWrritenTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//21.	WAP to create a 2D array of 4 X  4. Create a List from array such that 
//it contains only  lower Triangular matrix elements and print list in sorted order.

public class Problem21 {
	public static void main(String[] args) {
		int[][] m = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 2 } };

		List<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j <= 1; j++) {
				l.add(m[i][j]);
			}
		}
		Collections.sort(l);
		System.out.println(l);
	}
}