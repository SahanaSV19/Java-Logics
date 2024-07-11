package Tester;

public class frequenceofgivenstring4 {
public static void main(String[] args) {
	//frequency of only lower case vowels
	String str="PrograMming LanguAge IS EaSY";
	int [] arr=new int[123];
	for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		if(ch=='a'|| ch=='e' || ch=='i'|| ch=='o' || ch=='u')
		arr[ch]++;
	}
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]!=0)
			System.out.println((char)i+""+arr[i]);
	}
}
}
