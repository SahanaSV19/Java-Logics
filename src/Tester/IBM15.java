package Tester;

import java.util.Scanner;

public class IBM15 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 2 no's to find its LCM");
	int no1=sc.nextInt();
	int no2=sc.nextInt();
	int LCM;
	LCM=(no1>no2)?no1:no2;
	while(true)
	{
		if(LCM%no1==0 && LCM%no2==0)
		{
			System.out.printf("The LCM of %d and %d is %d.",no1,no2,LCM);
			break;
		}
		++LCM;
	}
	}
}
