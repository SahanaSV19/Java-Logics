package Tester;

public class stringconversion {
	public static void main(String[] args) {
		String str = "hello";
		for (int i = 0; i < str.length(); i++) {
			char ch =str.charAt(i);
			ch=(char)(ch+4);			
			System.out.print(ch);
		}

	}
}
