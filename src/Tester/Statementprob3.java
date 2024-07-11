package Tester;

import java.util.Scanner;

public class Statementprob3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of arr");
		int[] arr = new int[sc.nextInt()];
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
			System.out.println();
		}
		System.out.println("Enter a number to check");
		int num = sc.nextInt();
		System.out.println("Enter diffrence");
		int diff = sc.nextInt();
		System.out.println(findCount(arr, length, num, diff));
	}

	public static int findCount(int[] arr, int length, int num, int diff) {
		int diff1 = 0;
		int count = 0;
		for (int i = 0; i < length; i++) {
			diff1 = num - arr[i];
			if(diff1<=0)
			{
				diff1*=-1;
			}
			if (diff1 <= diff) {
				count++;
			}
		}
		if (count > 0)
			return count;
		else
			return -1;
	}
}
