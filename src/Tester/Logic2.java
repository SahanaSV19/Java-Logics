package Tester;

public class Logic2 {
public static void main(String[] args) {
	String str="Le@#$VE2345l";
		System.out.println(Pali(str.toLowerCase()));
}

private static String Pali(String str) {
	String str1=str.replace("@#$", "");
	String str2=str1.replace("2345", "");
	
	String str3="";
	for (int i = 0; i <str2.length(); i++) {
		str3=str2.charAt(i)+str3;
	}
	
	if(str2.equals(str3))
	{
	return "palindrome";
	}
	else
	{
		return "not a palindrome";
	}
}
}
