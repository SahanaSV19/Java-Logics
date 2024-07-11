package Tester;

import java.util.Scanner;

public class primenopresentinarray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a number inside an array");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {

			int no =arr[i];
			boolean flag=prime(no);
			if(flag)
			{
				System.out.print(arr[i]+" ");
			}
			
		}
	}

	private static boolean prime(int no) {
		// TODO Auto-generated method stub
		boolean flag=true;
		for(int i=2;i<no/2;i++)
		{
			if(no%i==0)
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
}