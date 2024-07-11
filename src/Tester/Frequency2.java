package Tester;

import java.util.Iterator;
import java.util.Scanner;

public class Frequency2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string to get its frequency");
	String str=sc.next();
	int count=0;
	int[] arr = new int[122];
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		arr[ch]++;
	}
	for(int j=0;j<arr.length;j++)
	{
		if(arr[j]!=0)
		{
			System.out.println((char)j+"->"+arr[j]);
		}
	}
}
}
