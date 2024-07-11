package Tester;

import java.util.Scanner;

public class IBM5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st line no of words");
	int no1= sc.nextInt();
	System.out.println("Enter 2nd line no of words");
	int no2=sc.nextInt();
	System.out.println("Enter total no of lines");
	int totlines=sc.nextInt();
	if(no1>no2 || no1<=0 || no2<=0)
	{
		System.out.println("Invalid input");
	}
	else
	{
		int[] arr = new int[totlines];
		arr[0]=no1;
		arr[1]=no2;
		for (int i = 2; i < totlines; i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		System.out.println(arr[totlines-1]);
	}
}
}
