package Tester;

public class HCF {
public static void main(String[] args) {
	int no =70;
	int no2=15;
	int ans=HCF(no,no2);
	System.out.println(ans);
}

private static int HCF(int m, int n) {
	 while(m!=n)
	    {
	        if(m>n)
	        {
	            m=m-n;
	        }
	        else
	        {
	            n=n-m;
	        }
	        
	    }
	return m;
}
}
