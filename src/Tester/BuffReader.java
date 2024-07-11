package Tester;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BuffReader {
public static void main(String[] args) throws Exception{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int no = Integer.parseInt(reader.readLine());
	String  String = "Sahana";
	char[] arr = String.toCharArray();
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]>=97&& arr[i]<=122)
			System.out.println(arr[i]);
	}
	System.out.println(no);
	System.out.println(String);
}
}
