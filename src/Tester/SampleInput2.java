package Tester;

public class SampleInput2 {
public static void main(String[] args) {
	String str="a3b5c2a2";
	String str2="";
	int no;
	for (int i = 0; i < str.length(); i=i+2) {
		no=Character.getNumericValue(str.charAt(i+1));
		while(no!=0)
		{
			str2=str2+str.charAt(i);
			no--;
		}
		
	}
	System.out.println(str2);
	
}
}
