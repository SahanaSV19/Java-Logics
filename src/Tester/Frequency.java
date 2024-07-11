package Tester;

import java.util.Scanner;

public class Frequency {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a String to get the frequency of characters");
	String str=sc.next();
	int[] arr = new int[122];
	for(int i=0;i<str.length();i++)
	{
		char ch = str.charAt(i);
		arr[ch]++;
	}
	for(int j =0;j<arr.length;j++)
	{
		if(arr[j]!=0)
		{
			System.out.println((char)j+"->"+arr[j]);
		}
	}
}
}
