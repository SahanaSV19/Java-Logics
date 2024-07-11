package Tester;

public class Frequencyofvowels {
public static void main(String[] args) {
	String str="Java is programming language";
	str=str.toLowerCase();
	int [] arr = new int[122];
	for(int i =0;i<str.length();i++)
	{
		char ch = str.charAt(i);
		arr[ch]++;
	}
	for(int j=0;j<arr.length;j++)
	{
		if(arr[j]!=0)
		{
			if((char)j=='a'||(char)j=='e'||(char)j=='i'||(char)j=='o'||(char)j=='u')
			{
				System.out.println((char)j+"  ->  "+arr[j]);
			}
		}
	}
}
}
