package Tester;

public class rerverseString2 {
public static void main(String[] args) {
	String str = "Karishma";
	String str2="";
	char[] ch =str.toCharArray();
	for(char c:ch)
	{
		str2=c+str2;
	}
	System.out.println(str2);
}
}
