package Tester;

import java.util.Scanner;

public class IBM7 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no of fibonacci digits u want to generate");
	int total = sc.nextInt();
	int[] arr = new int[total];
	arr[0]=0;
	arr[1]=1;

	for (int i = 2; i < total; i++) {
		arr[i]=arr[i-1]+arr[i-2];		
	}
	System.out.println("Output: ");
	System.out.println("");
	for (int k = 1; k <= total; k++) {
		for (int j = 0; j < k; j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println("");
	}

}
}
