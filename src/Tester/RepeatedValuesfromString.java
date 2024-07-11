package Tester;

public class RepeatedValuesfromString {
public static void main(String[] args) {
	String str="Hey Hey hi hi hi how how how";
	String[] s1=str.split(" ");
	for (int i = 0; i < s1.length-1; i++) {

		if(!removeAdjacent(s1[i],s1[i+1]))
		{
			System.out.print(s1[i]+" ");
		}
	}
	System.out.println(s1[s1.length-1]);
	
}

private static boolean removeAdjacent(String s1, String s2) {
	// TODO Auto-generated method stub
	if(s1.length()!=s2.length())
	{
		return false;
	}
	for (int i = 0; i < s1.length(); i++) {
		if(s1.charAt(i)!=s2.charAt(i))
		{
			return false;
		}
	}
	return true;
}
}
