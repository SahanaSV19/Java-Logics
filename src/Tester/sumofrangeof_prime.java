package Tester;

public class sumofrangeof_prime {
	public static void main(String[] args) {
		int n=3;
		int sum=0;
		for (int i = n; i <= 19; i++) {
			int no = i;
			boolean flag=true;
			for (int j = 2; j < no; j++) 
		{	
			if(no%j==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			sum+=no;
			
		}
	}
		System.out.println(sum);
}
}