package AssignmentArray;

//Write a Java program to test the equality of two arrays. Means 
//e.g arr1[] = [12, 22, 32, 42, 52, 62] and arr2[] = [52, 22, 62, 12, 42,32] Here both arrays are equal.

public class EqualityArray {

	public void display(int arr1[], int arr2[]) {
		if (arr1.length != arr2.length) {
			System.out.println("Those array not Equal..");
		} else {
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr2.length; j++) {
					if (arr1[i] == arr2[j]) {
					}
				}
			}
			System.out.println("Both Array are Equal.....");
		}
	}

	public static void main(String[] args) {

		int arr1[] = { 12, 22, 32, 42, 52, 62 };
		int arr2[] = { 52, 22, 62, 12, 42, 32 };

		EqualityArray obj = new EqualityArray();
		obj.display(arr1, arr2);

	}

}
