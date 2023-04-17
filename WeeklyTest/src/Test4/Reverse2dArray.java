package Test4;

import java.util.Arrays;

//Arr is a two dimensional array as follows. 

//Arr = { { 1,2,3,4} , {5,6,7,8}}
//Create a new array ArrCopy which should be as follows
//ArrCopy = {{4,3,2,1} , { 8,7,6,5}

public class Reverse2dArray {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

		for (int i = 0; i < arr.length; i++) {
			int k = arr[i].length - 1;
			for (int j = 0; j < arr[i].length / 2; j++) {

				int temp = arr[i][k];
				arr[i][k] = arr[i][j];
				arr[i][j] = temp;
				k--;
			}
		}
		for (int i = 0; i < arr.length; i++) {

			System.out.println(Arrays.toString(arr[i]));
		}
	}
}
