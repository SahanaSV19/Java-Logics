package Tester;

import java.util.Scanner;

public class Statementprob4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		System.out.println("Enter m");
		int m = sc.nextInt();

		System.out.println(diffrenceofSum(n, m));
	}

	private static int diffrenceofSum(int n, int m) {
			int sumofn=0;
			int sumofnotn=0;
			for(int i=1;i<=m;i++)
			{
				if(i%n==0)
				{
					sumofn+=i;
				}
				else
				{
					sumofnotn+=i;
				}
			}
			if(sumofn>sumofnotn)
				return sumofn-sumofnotn;
			else
				return sumofnotn-sumofn;
	}
}
