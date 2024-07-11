package Tester;

import java.util.HashSet;

//A string which contains all 26 letters is called panagram
public class Panagram {
	public static void main(String[] args) {
		String str = "The quick brown fox jumps over a lazy dog";
		str = str.toLowerCase();
		HashSet h1 = new HashSet<>(); //we use Hashset becoz its autosorted
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				h1.add(ch);
			}
		}
		if (h1.size() == 26) {
			System.out.println("Panagram");
		} else {
			System.out.println("Not a Panagram");
		}
	}
}
