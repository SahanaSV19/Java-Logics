package Tester;

import java.util.Scanner;

//change decimal no into binary
public class IBM6 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[10];
	System.out.println("Enter a decimal to find its binary code");
	int no=sc.nextInt();
	for (int i = 0; no>0; i++) {
		arr[i]=no%2;
		no=no/2;
	}
	System.out.println("BInary of the given number is: ");
	for (int i = arr.length-1; i >=0; i--) {
		System.out.print(arr[i]);
	}
}
}
