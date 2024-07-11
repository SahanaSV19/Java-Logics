package Tester;

import java.util.Scanner;

public class Primeno {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to check if its prime or not");
	int no = sc.nextInt();
	boolean flag=true;
	while(flag==true)
	{
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag=false;
				break;
			}
		}
		break;
	}
	if(flag)
	{
		System.out.println(no+" is a prime no");
	}
	else
	{
		System.out.println(no+" is not a prime no");
	}
	
}
}
