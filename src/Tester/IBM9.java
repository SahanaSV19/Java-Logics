package Tester;

import java.util.Scanner;

public class IBM9 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no");
	int no=sc.nextInt();
	int[] arr= new int[no];
	arr[0]=0;
	arr[1]=1;
	for (int i = 2; i < no; i++) {
		arr[i]=arr[i-1]+arr[i-2];
	}
	System.out.println(arr[no-1]);
	}
}
