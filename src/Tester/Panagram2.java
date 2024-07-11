package Tester;

import java.util.HashSet;

public class Panagram2 {
public static void main(String[] args) {
	String str="The quick brown fox jumps over a lazy dog";
	str=str.toLowerCase();
	HashSet hashSet = new HashSet<>();
	for(int i =0;i<str.length();i++)
	{
		char ch = str.charAt(i);
		if(ch>='a'&&ch<='z')
		{
			hashSet.add(ch);
		}
	}
	if(hashSet.size()==26)
	{
		System.out.println("Panagram");
	}
	else
	{
		System.out.println("Not a panagram");
	}
		
}
}
