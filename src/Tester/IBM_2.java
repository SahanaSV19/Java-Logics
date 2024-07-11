package Tester;

import java.util.Scanner;

public class IBM_2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the ASCII value of ur password");
	String s1=sc.next();
	String s2="";
	String res="";
	for (int i = 0; i < s1.length(); i++) {
		s2=s1.charAt(i)+s2;
	}
	int i=0;
	while(i<s2.length()) {
		String x=s2.charAt(i)+""+s2.charAt(i+1);
		if(x=="32")
		{
			res=res+" ";
			
		}
		
		else if((Integer.parseInt(x)>=65 && Integer.parseInt(x)<=91) || Integer.parseInt(x)>=97 && Integer.parseInt(x)<=122)
		{
			String a=new Character((char)Integer.parseInt(x)).toString();
			res=res+""+ a ;
		}
		else if (i+2<s2.length())
		{
			x=x+""+s2.charAt(i+2);
			String a=new Character((char)Integer.parseInt(x)).toString();
			res=res+""+a;
			i+=1;
		}
		i+=2;
	}
	System.out.println(res);
}

}
