package Tester;

public class Primefactors {
public static void main(String[] args) {
	int no=23;
	for (int i = 1; i <= no; i++) {
		if(no%i==0)
		{
		if(prime(i))
		{
			System.out.println(i);
		}
		}
	}
}

private static boolean prime(int i) {
	// TODO Auto-generated method stub
	boolean flag = true;
	for (int j = 2; j <= i/2; j++) {
		if(i%j==0)
		{
			flag=false;
		}
	}
	return flag;	
}
}
