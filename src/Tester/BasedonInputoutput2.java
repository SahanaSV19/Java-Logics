package Tester;

import java.util.Scanner;

public class BasedonInputoutput2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		int no = sc.nextInt();
		int count=0;
		for (int i = j; i <= no; i++) {
			{
				count++;
				if(count<=2)
				{
				System.out.print("hi" + i+" ");
				}
				else if(count>2 && count<5)
				{
				System.out.print("ok" + i+" ");
				count=0;
				}
		
			}
		}
	}
}
