package Generics;

/*
 * 3) Write a generic method to exchange the positions of two different elements in an array. 
 */

public class Q3 {

	public static <T> void changePos(T[] arr, int pos1, int pos2) {

		T t = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = t;

	}
	public static void main(String[] args) {

		Q3 q3 = new Q3();
		Integer arr[] = { 1, 2, 3, 4 };
		q3.changePos(arr, 2, 3);

		for (int i : arr) {
			System.out.println(i);
		}
	}

}
