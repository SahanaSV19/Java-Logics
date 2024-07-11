package Tester;
//sample input=a3b5c2a2 output=aaabbbbbcc
public class Sampleinput {
public static void main(String[] args) {
	String str1="a3b5c2a2";
	String CompressedResult=properCompression(str1);
	System.out.println(CompressedResult);
}

private static String properCompression(String str1) {
	
	StringBuilder builder = new StringBuilder();
	for (int i = 0; i < str1.length(); i=i+2) {
		char ch =str1.charAt(i);
		int count=Character.getNumericValue(str1.charAt(i+1));
		while(count>0)
		{
			builder.append(ch);
			count--;
		}
		
	}
	return builder.toString();
}
}
