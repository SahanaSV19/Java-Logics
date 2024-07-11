package Tester;

//WAP to check if a string is palindrome or not without using equals(),charAt(),forloop()
public class stringProgram1 {
	public static boolean compareString(char[] ch) {
		

		int i = 0;
		int j=ch.length-1;
		while(i<j)
		{
			if(ch[i]!=ch[j])
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		String str = "APPA";
		char[] ch = str.toCharArray();
		
		if(compareString(ch))
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a plaindrome");
		}
	}
}
