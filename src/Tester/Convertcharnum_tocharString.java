package Tester;

public class Convertcharnum_tocharString {
public static void main(String[] args) {
	String str = "3a2b2c1d";
	for(int i = 0 ;i<str.length();i++)
	{
		if(Character.isAlphabetic(str.charAt(i)))
		{
			System.out.print(str.charAt(i));
		}
		else
		{
			int no = Character.getNumericValue(str.charAt(i));
			for(int j =1;j<no;j++)
			{
				System.out.print(str.charAt(i+1));
			}
		}
	}
}
}
