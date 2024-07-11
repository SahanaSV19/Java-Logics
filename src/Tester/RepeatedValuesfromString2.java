package Tester;

public class RepeatedValuesfromString2 {
public static void main(String[] args) {
	String str="Bengaluru Bengaluru Bengaluru is Bengaluru Bengaluru my city";
	String[] s1= str.split(" ");
	for (int i = 0; i < s1.length-1; i++) {
		if(!s1[i].equals(s1[i+1])) {
			System.out.println(s1[i]+" ");
		}
	}
	System.out.println(s1[s1.length-1]);
}
}
