package Tester;

import java.util.Scanner;

//Check if the string is palindrome or not without using equals()
public class Stringpalindrome {
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter a String to reverse");
	String s=scanner.next();
	String rev="";
	char[] ch=s.toCharArray();
	for(int i=ch.length-1;i>=0;i--)
	{
		rev+=ch[i];
	}
	if(s.equals(rev))
	{
		System.out.println(s+" is a palindrome");
	}
	else
	{
		System.out.println(s+" is not a palindrome");
	}
}
}
