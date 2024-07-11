package Tester;

import java.util.Scanner;

public class Happyno {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to check if its happy no or not");
	int no = sc.nextInt();
	int copy=no;
	while(no>9)
	{
		int sum =sumofsqdigits(no);
		no=sum;
	}
	if(no==1)
	{
		System.out.println(copy+" is a happy no");
	}
	else
	{
		System.out.println(copy+" is not a happy no");
	}
}
public static int sumofsqdigits(int no)
{
	int rem;
	int sum=0;
	while(no!=0)
	{
		rem=no%10;
		sum+=(rem*rem);
		no=no/10;
	}
	return sum;
}
}
