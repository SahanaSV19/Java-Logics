package Tester.predrivetest;

import java.util.Scanner;

public class Sample1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] arr= {10,20,30,40};
	boolean flag = true;
	System.out.println("enter a num");
	int no=sc.nextInt();
	for (int i = 0; i < arr.length; i++) {
		if( no==arr[i])
		{
			flag=false;
			break;
		}}
	
		if(flag==false)
		{
			System.out.println("num is present");
		}
		else
		{
			System.out.println("num is not present");
		}
	}
}

