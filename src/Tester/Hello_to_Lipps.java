package Tester;

public class Hello_to_Lipps {
	public static void main(String[] args) {
		String str="Hello";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			ch=(char)(ch+4);
			System.out.print(ch);
		}
	}
}
