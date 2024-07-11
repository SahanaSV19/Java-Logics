package Tester;

import java.util.LinkedHashSet;
import java.util.Set;

public class Treeset {
	public static void main(String[] args) {
		String str="hello";
		char[] ch = str.toCharArray();
		Set s1 = new LinkedHashSet();
		for(char c:ch)
		{
			s1.add(c);
		}
		System.out.println(s1.toString());
	}
}
