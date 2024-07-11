package Tester;

import java.util.Scanner;

public class Factor {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to find its factor");
	int no = sc.nextInt();
	for(int i=no;i>0;i--)
	{
		if(no%i==0)
		{
			System.out.println(i);
		}
	}
}
}
