package Tester;

public class frequencyofstring2 {
public static void main(String[] args) {
	String str="aabbcc";
	int count=0;
	int[] arr = new int[123];
	for (int i = 0; i < str.length(); i++) {
		char ch=str.charAt(i);
		arr[ch]++;
	}
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]!=0)
		{
			System.out.print((char)i+""+arr[i]);
		}
		
	}
}
}
