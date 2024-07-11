package Tester;

import java.util.Scanner;

public class FactorialRecurssion {
	
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a no");
	int no =sc.nextInt();
	System.out.println(fact(no));
}

private static int fact(int no) {
	// TODO Auto-generated method stub
	if(no==0)
	{
		return 1;
	}
	else
	{
		return no*fact(no-1);
	}

}
}
