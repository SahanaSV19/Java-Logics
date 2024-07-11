package Tester;

import java.util.Scanner;

//perfect number is a number which has sum of factors equal to itself
public class Perfectno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if its a perfet or not");
		int no = sc.nextInt();

		int sum = 0;
		for (int i = 1; i < no; i++) {
			if (no % i == 0) {
				sum += i;
			}
		}
		if (no == sum)
			System.out.println(sum + " is a perfect number");
		else
			System.out.println(no + " is not a perfect number");
	}
}
