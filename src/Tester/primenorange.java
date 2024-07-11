package Tester;

public class primenorange {
public static void main(String[] args) {
	for (int i = 1; i < 100; i++) {
		int no=i;
		boolean flag = true;
		for (int j = 2; j <= no/2; j++) {
			if(no%j==0)
			{
				flag=false;
			}
		}
		if(flag)
		{
			System.out.print(no+" ");
		}
	}
}
}
