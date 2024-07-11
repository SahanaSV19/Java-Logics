package Tester;
import java.util.Scanner;
//factorial-the product of an integer and all the integers below it
public class Factorial {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to find its factorial");
	int no = sc.nextInt();
	int fact=1;
	for(int i=no;i>0;i--)
	{
		fact=fact*i;
	}
	System.out.println(fact);
}
}
