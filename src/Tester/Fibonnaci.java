package Tester;

import java.util.Scanner;

public class Fibonnaci {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number to find its fibonnaci series");
	int no= scanner.nextInt();
	int no1=0;
	System.out.print(no1+" ");
	int no2=1;
	System.out.print(no2);
	int no3;
	for(int i=2;i<no;i++)
	{
		no3=no2+no1;
		System.out.print(" "+no3);
		no1=no2;
		no2=no3;
	}
}
}
