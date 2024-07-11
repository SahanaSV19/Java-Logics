package Tester;

import java.util.Scanner;

public class IBM13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no");
		int no = sc.nextInt();
		int count = bool(no);
		int[] arr = new int[count];
		int j = 0;
		for (int i = 0; i < count; i++) {
			int num = (int) Math.pow(2, j);
			arr[i] = no | num;
			j++;
		}
		int ans = sorting(arr);
		System.out.println(ans);
		bool(ans);
	}
	// to find the binary value
	public static int bool(int no) {
		String bin = "";
		int count = 0;
		while (no != 0) {
			int rem = no % 2;
			bin = rem + bin;
			no = no / 2;
			count++;
		}
//		System.out.println(bin);
		return count;
	}
	// to sort array
	public static int sorting(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		return arr[arr.length - 1];
	}

}
