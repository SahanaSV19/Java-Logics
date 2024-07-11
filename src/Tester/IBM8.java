package Tester;

import java.util.Scanner;

public class IBM8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to determine if its armstrong or not");
		int no = sc.nextInt();
		int copy = no;
		int len = 0;
		while (no != 0) {
			no = no / 10;
			len++;
		}
		int oper = 1;
		int sum = 0;
		no = copy;

		while (no != 0) {
			int rem = no % 10;
			for (int i = 0; i < len; i++) {
				oper *= rem;
			}
			
			sum += oper;
			no = no / 10;
			oper=1;
		}
		
		if (copy == sum) {
			System.out.println("Armstrong");

		} else {
			System.out.println("Not an armstrong");
		}

	}
}
