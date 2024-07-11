package Tester;

public class Stringtochar_Distinctchar {
public static void main(String[] args) {
	String str = "Hello";
	char[] ch = str.toCharArray();
	distinctCharacter(ch);
	
}
static void distinctCharacter(char[] input)
{
	for(int i =0;i<input.length;i++)
	{	
		boolean flag = true;
		for(int j=0;j<input.length;j++)
		{
			if(i!=j&&input[i]==input[j])
			{
				flag = false;
				break;
			}
		}
		if(flag == true)
		{
			System.out.println(input[i]+" ");
		}
	}
}
}
