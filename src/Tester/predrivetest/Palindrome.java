package Tester.predrivetest;

public class Palindrome {
public static void main(String[] args) {
	int no =121;
	int rev=0;
	int copy=no;
	while(no!=0)
	{
		int rem = no%10;
		rev=(rev*10)+rem;
		no=no/10;
	}
	if(copy==rev)
	{System.out.println("palindrome");
	}
	else
	{
		System.out.println("Not a plaindrome");
	}
}
}
