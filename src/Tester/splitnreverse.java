package Tester;

public class splitnreverse {
public static void main(String[] args) {
	String str = "Knowledge";
//	str1=str.substring(4,str.length());
//	for(int i =0;i<4;i++)
//	{
//		str2=str.charAt(i)+str2;
//	}
//	str2=str2.substring(0,str2.length());
//	System.out.println(str1+str2);
	//or
	String s1=str.substring(0,4);
	String s2=str.substring(4);
	String reverse="";
	for(int i=s1.length()-1;i>=0;i--)
	{
		reverse=reverse+s1.charAt(i);
	}
	System.out.println(s2+""+reverse);
}
}
