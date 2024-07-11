package Tester;

public class sumof_last2digit {
public static void main(String[] args) {
	int no=1234;
	int rem=no%100;
	no=no/100;
	rem=add(rem);
	System.out.println(no+""+rem);
}
public static int add(int no)
{
	
	int sum=0;
	while(no!=0)
	{
		int rem=no%10;
		sum=sum+rem;
		no=no/10;
	}
	return sum;
}
}
