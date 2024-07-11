package Tester;

import java.util.Scanner;

public class ReverseAStringRecurssion {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string");
	String str=sc.next();
	System.out.println(rev(str,(str.length()-1)));
}

private static String rev(String str1,int i) {
	// TODO Auto-generated method stub
	if(i==0)
	{
		return str1.charAt(i)+"";
	}
	else
	{
		return str1.charAt(i)+rev(str1,i-1);
	}
}


}
