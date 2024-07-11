package Tester;

import java.util.Scanner;

public class IBM_1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string"); //hackerhappy
	String s1=sc.next();
	System.out.println("Enter another String to compare"); //hackerrank
	String s2= sc.next();
	System.out.println("Enter no of rotations"); //9
	int k =sc.nextInt();
	int j;
	j=s1.length()<s2.length()?s1.length():s2.length();
	if(s1.length()+s2.length()<=k)
	{
		System.out.println("Yes");
	}
	
	else {
		for (int i = 0; i < j; i++) {
			if(s1.charAt(i)!=s2.charAt(i))
			{
				j=i;
				break;
			}
		}
		k=k-(s1.length()-j);
		k=k-(s2.length()-j);
		if(k>=0&&k%2==0)
			System.out.println("yes");
		else
			System.out.println("No");
		
	}
	
	
}
}
