package Tester;

import java.util.Scanner;

//Strong number is a number whose sum of factorial of digits is equal to the original number
public class Strongnum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if the number is factorial or not");
		int no = sc.nextInt();
		int copy=no;
		int sum=0;
		int rem = 0;
		while (no != 0) {
			rem = no % 10;
			sum+=factorial(rem);
			no = no / 10;
		}
		if(sum==copy)
		System.out.println(copy+" is a Strong number");
		else
			System.out.println(copy+" is not a Strong number");
	}

	public static int factorial(int no) {
		int fact=1;
		for(int i=no;i>0;i--)
		{
			fact*=i;
		}
		return fact;
	}
}
