package Tester;


public class Convertcharnum_tocharString2 {
	public static void main(String[] args) {
		String str ="a3b2c2d1";
		for(int i =0;i<str.length();i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))
			{
				System.out.print(str.charAt(i));
			}
			else
			{
			int no = (int)Character.getNumericValue(str.charAt(i));
			for(int j =1;j<no;j++)
			{
				System.out.print(str.charAt(i-1));
			}
			}
		}
	}

}
