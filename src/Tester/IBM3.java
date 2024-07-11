package Tester;

import java.util.Scanner;

public class IBM3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the ASCII value of password");
	String s1=sc.next();
	String s2="";
	String res="";
	for (int i = 0; i < s1.length(); i++) {
		s2=s1.charAt(i)+s2;
	}
//	System.out.println(s2);
	int i=0;
	while(i<s2.length())
	{
		String x = s2.charAt(i)+""+s2.charAt(i+1);
		int y=Integer.parseInt(x);
		if(x=="32")
		{
			res=res+" ";
		}
		else if((y>=65&&y<=91)||(y>=	97&&y<=122))
		{
			String a= new Character((char)y).toString();
			res=res+""+a;
		}
		else if(i+2<s2.length())
		{
			x=x+""+s2.charAt(i+2);
			String a= new Character((char)Integer.parseInt(x)).toString();
			res=res+""+a;
			i=i+1;
		}
		i=i+2;
	}
	System.out.println(res);
}
}
