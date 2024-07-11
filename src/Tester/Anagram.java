package Tester;

import java.util.Arrays;

//multiple words with same length,different meaning,but should contain same characters, e.g.,"being" and "begin"
public class Anagram {
public static void main(String[] args) {
	String Str1="begin";
	String Str2="being";
	if(Str1.length()==Str2.length())
	{
		char[] ch = Str1.toCharArray();
		char[] ch1=Str2.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		if(Arrays.equals(ch, ch1))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not an anagram");
		}
	}
	else
	{
		System.out.println("Not an anagram due to length");
	}
	
}
}