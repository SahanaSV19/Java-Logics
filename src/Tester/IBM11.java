package Tester;

import java.util.Scanner;

public class IBM11 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 2 no's");
	int no1=sc.nextInt(),no2=sc.nextInt();
	int ans=HCF(no1,no2);
	System.out.println(ans);
}

private static int HCF(int no1, int no2) {
	// TODO Auto-generated method stub
	int result=Math.min(no1, no2);
	while(result>0)
	{
		if(no1%result==0 && no2%result==0)
		{
			break;
		}
		else
		{
			result--;
		}
	}
	return result;
}
}
