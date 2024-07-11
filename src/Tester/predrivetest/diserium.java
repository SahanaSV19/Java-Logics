package Tester.predrivetest;

public class diserium {
public static void main(String[] args) {
	int no =135;
	int copy=no;
	int sum=0;
	int count=3;
	while(no!=0)
	{
		int rem= no%10;
		sum=sum+(int)Math.pow(rem,count);
			no=no/10;
			count--;
	}
	System.out.println(sum);
	if(sum==copy)
	{
		System.out.println("deserium");
	}
	else
	{
		System.out.println("Not a deserium");
	}
}
}
