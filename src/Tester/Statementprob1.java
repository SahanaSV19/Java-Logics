package Tester;

import java.util.Scanner;

public class Statementprob1 {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no of rats");
	int r = sc.nextInt();
	System.out.println("Enter no of units rat consumes");
	int unit=sc.nextInt();
	System.out.println("Enter no of houses");
	int n=sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<arr.length;i++)
	{
//		System.out.println("Enter food from house "+(i+1));
		arr[i]=sc.nextInt();
	}
	int j=func(r,unit,n,arr);
	System.out.println(j);
}
public static int func(int r,int unit,int n,int[]arr)
{
	int total=r*unit;
	if(n==0)
		return -1;
	int foodtillnow=0;
	int house=0;
	for( house=0;house<n;house++)
	{
		foodtillnow+=arr[house];
		if(foodtillnow>=total)
			break;
	}
	if(total>foodtillnow)
		return 0;
	return house+1;
}
}
