package Tester;

public class HCF2 {
public static void main(String[] args) {
	int no1=70;
	int no2=15;
	while(no1!=no2)
	{
		if(no1>no2)
			no1=no1-no2;
		
		else
			no2=no2-no1;
	}
	System.out.println(no1);
	
	
}
}
