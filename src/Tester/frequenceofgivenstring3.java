package Tester;

public class frequenceofgivenstring3 {
	//frequency of only lower case letters
public static void main(String[] args) {
	String str="ProograMming LanguAge IS EaSY";
	
	
	int[] arr = new int[127];
	
		for (int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j);
			arr[ch]++;
		}
		for (int j = 97; j <122; j++) {
			if(arr[j]!=0)
			{
				System.out.println(arr[j]+""+(char)j);
			}
		}
	
}
}
