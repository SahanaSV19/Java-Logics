package Tester;

import java.util.Scanner;

public class Base_and_exponential {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter base no");
	int base=scanner.nextInt();
	System.out.println("Enter power no");
	int pow=scanner.nextInt();
	int ans=1;
	for (int i = 0; i < pow; i++) {
		ans*=base;
	}
	System.out.println(ans);
}
}
