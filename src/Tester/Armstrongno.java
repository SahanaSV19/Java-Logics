package Tester;

import java.util.Scanner;

//Armstrong = Sum of its own digits raised to the power number of digits gives the number itself
public class Armstrongno {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to check if its a Strong number or not");
	int no = sc.nextInt();
	int og =  no;
	int og2=no;
	int rem;
	int count=0;
	while(no!=0)
	{
		rem=no%10;
		no=no/10;
		count++;
	}
	int rem2;
	int result=0;
	while(og!=0)
	{
	rem2=og%10;
	result +=Math.pow(rem2, count);
	og=og/10;
	}
	if(og2==result)
		System.out.println(og2+" is an Armstrong number");
	else
		System.out.println(og2+" is not an Armstrong number");
}
}
