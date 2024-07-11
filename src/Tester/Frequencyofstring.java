package Tester;

public class Frequencyofstring {
public static void main(String[] args) {
	String str = "aaabbccd";
	int[] arr = new int[123];
	for(int i =0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		arr[ch]++;
	}
	for(int j=0;j<arr.length;j++)
	{
		if(arr[j]!=0)
		{
			System.out.print(arr[j]+""+(char)j);
		}
	}
	
}
}
