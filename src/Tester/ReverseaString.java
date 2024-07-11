package Tester;

import java.util.Scanner;

public class ReverseaString {
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
	System.out.println(rev);
}
}
