package Tester;

import java.util.Scanner;

public class Sample2 {
static int sum;
Scanner sc = new Scanner(System.in); 
public static void main(String[] args) {
	int no =89763;
	while(no!=0)
	{
		int rem=no%10;
		if(rem%2==0)
		{
			sum+=fact(rem);
		}
		else
		{
			sum+=rem*rem;
		}
		no=no/10;
	}
	System.out.println(sum);
	
}
static int fact(int no)
{
	int fno=1;
	for (int i = 1; i <=no; i++) {
		fno=fno*i;
	}
	return fno;
}

}
