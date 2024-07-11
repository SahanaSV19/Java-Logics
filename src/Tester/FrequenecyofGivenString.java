package Tester;

public class FrequenecyofGivenString {
public static void main(String[] args) {
	String str="Sahana";
	int[] ch=new int[123];
	for (int i = 0; i < str.length(); i++) {
		char ch1=str.charAt(i);
		ch[ch1]++;
	}
	for (int i = 0; i < ch.length; i++) {
		if(ch[i]>0)
		{
			System.out.println((char)i+" " +ch[i]);
		}
	}
}
}
