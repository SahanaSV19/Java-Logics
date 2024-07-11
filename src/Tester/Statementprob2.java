package Tester;

import java.util.Scanner;

public class Statementprob2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Enter a string");
	String s=sc.next();
	int n=s.length();
	System.out.println(CheckPassword(s, n));
	
			
}
public static int CheckPassword(String str,int n)
{
	if(n<4)
		return 0;
	if(str.charAt(0)>='0'&& str.charAt(0)<='9')
		return 0;
	int num=0;
	int cap=0;
	for(int i =0;i<n;i++)
	{
		if(str.charAt(i)==' ' || str.charAt(i)=='/')
			return 0;
		if(str.charAt(i)>='A'&& str.charAt(i)<='Z')
			cap++;
		if(str.charAt(i)>='0' && str.charAt(i)<='9')
			num++;
		
	}
	if(cap>0&& num>0)
		return 1;
	else
		return 0;
}
}
