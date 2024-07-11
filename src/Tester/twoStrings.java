package Tester;

public class twoStrings {
public static void main(String[] args) {
	String str1="Sahana";
	String str2="Sana";
	boolean flag = true;
	if(str1.length()==str2.length())
	{
		for (int i = 0; i < str1.length(); i++) {
			char ch1=str1.charAt(i);
			char ch2=str2.charAt(i);
			if(ch1 == ch2)
			{
				flag =true;
			}
			else
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Strings are identical");
		}
		else
			System.out.println("Strings are not identical");
		
	}
	else
	{
	System.out.println("Strings are not identical");
	}
}
}
