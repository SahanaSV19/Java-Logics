package Tester;
//WAP to find the length of string without using length()or length
public class LengthofString {
public static void main(String[] args) {
	String str = "Sahana";
	int count=0;
			char[] ch = str.toCharArray();
			for(char c:ch)
			{
				count++;
			}
			System.out.println(count);
			
}
}
