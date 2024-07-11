package Tester;

import java.util.Scanner;

public class IBM4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.next();
		str = str.replace('@', ' ').replace('$', ' ');
		String[] arr = str.split(" ");
		int k = arr.length;
		int[] arr1 = new int[k];
		for (int i = 0; i < k; i++) {
			arr1[i] = arr[i].length();
		}
		int temp;
		for (int j = 0; j < k; j++) {

			for (int i = 1; i < (k - j); i++) {

				if (arr1[i-1] > arr1[i]) {
					temp = arr1[i-1];
					arr1[i-1] = arr1[i];
					arr1[i] = temp;
				}
			}
		}
		
			System.out.println(arr1[0]);
	}

}
