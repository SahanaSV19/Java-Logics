package Tester;

//Strong Number is sum of factorial of digits
public class StrongNoRange {
public static void main(String[] args) {
	for (int i = 1; i < 200000; i++) {
		int no=i;
		int copy=i;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum+=factorial(rem);
			no=no/10;
		}
		if(copy==sum)
		{
			System.out.print(copy+" ");
		}
	}
}

private static int factorial(int rem) {
	int ans=1;
	for (int i = 2; i <=rem; i++) {
		ans*=i;
	}
	return ans;
}
}
