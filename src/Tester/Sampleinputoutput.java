package Tester;

import java.util.Scanner;

public class Sampleinputoutput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer");
		int i=sc.nextInt();
		System.out.println("Enter a decimal");
		double j=sc.nextDouble();
		System.out.println("Enter a String");
		sc.nextLine();
		String s=sc.nextLine();
		System.out.println(s);
		System.out.println(j);
		System.out.println(i);
	}
}
