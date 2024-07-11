package Tester;

public class Logic1 {
public static void main(String[] args) {
	String str="La!@#ng123ua*&^ge";
		System.out.println(Reverse(str));
}

private static String Reverse(String str) {
	
	String str1=str.replace("!@#", "");
	String str2=str1.replace("123", "");
	String str3=str2.replace("*&^", "");
	String str4="";
	for (int i = 0; i <str3.length(); i++) {
		str4=str3.charAt(i)+str4;
	}
	return str4;
}
}
