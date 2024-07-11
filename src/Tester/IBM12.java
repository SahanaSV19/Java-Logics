package Tester;

import java.util.Scanner;

public class IBM12 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter year to check if its leap year or not");
	int year = sc.nextInt();
	String ans=leapyear(year)  ? "Its a leap year":"Its not a leap year";
	System.out.println(ans);
}
private static boolean leapyear(int year) {
	if(year%400==0)
		return true;
	
	else if(year%100==0)
		return false;
	
	else if(year%4==0)
		return true;
	
	return false;
}

}
