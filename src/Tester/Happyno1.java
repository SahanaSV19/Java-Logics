package Tester;

public class Happyno1 {
public static void main(String[] args) {
	int no =1;
	int copy=no;
	while(no>9)
	{
		no=single(no);
	}
	if(no==1|| no==7)
		System.out.println(copy+" is a happy number");
	else
		System.out.println(copy+" is not a happy number");
}

private static int single(int no) {
	int ans;
	int rem=0;
	// TODO Auto-generated method stub
	while(no!=0)
	{
		ans=no%10;
		rem+=(ans*ans);
		no=no/10;
	}
	return rem;
}
}
