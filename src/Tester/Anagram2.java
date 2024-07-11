package Tester;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string");
	String str1=(sc.next()).toLowerCase();
	System.out.println("Enter another string");
	String str2=(sc.next()).toLowerCase();
	if(str1.length()==str2.length())
	{
		char[] ch = str1.toCharArray();
		char[] ch2 
		= str2.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch2);
		if(Arrays.equals(ch, ch2))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not an Anagram");
		}
	}
	else {
		System.out.println("Noot an anagram due to length");
	}
}
}
