package Tester;

import java.util.Scanner;

public class IBM10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 nos");
		int m = sc.nextInt(), n = sc.nextInt();
		while (m != n) {
			if (m > n) {
				m = m - n;
			} else {
				n = n - m;
			}
		}
		System.out.println(m);
	}
}
