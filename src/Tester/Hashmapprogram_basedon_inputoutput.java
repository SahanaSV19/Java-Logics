package Tester;

public class Hashmapprogram_basedon_inputoutput {
	static String s1="";
public static void main(String[] args) {
	String str="hello";
	for (int i = 0; i < str.length(); i++) {
		print(str.charAt(i));
	}
	
}
private static void print(char ch) {
	// TODO Auto-generated method stub
	char c='a';
	while(c<=ch)
	{
		System.out.println(s1+""+c);
		c=(char)(c+1);
	}
	s1=s1+ch;
}
}
