package Tester;
public class IBM {
public static void main(String[] args) {
	String str="nine FIVE nine one nine seven one five eight nine";
	String [] arr = str.split(" ");
	int[] ans = new int[arr.length];
	for (int i = 0; i < arr.length; i++) {
		String str1=arr[i].toLowerCase();
		if(str1.equals("one"))
		{
			ans[i]=1;
		}
		else if(str1.equals("two"))
		{
			ans[i]=2;
		}
		else if(str1.equals("three"))
		{
			ans[i]=3;
		}
		else if(str1.equals("four"))
		{
			ans[i]=4;
		}
		else if(str1.equals("five"))
		{
			ans[i]=5;
		}
		else if(str1.equals("six"))
		{
			ans[i]=6;
		}
		else if(str1.equals("seven"))
		{
			ans[i]=7;
		}
		else if(str1.equals("eight"))
		{
			ans[i]=8;
		}
		else if(str1.equals("nine"))
		{
			ans[i]=9;
		}
	}
	for (int i = 0; i < ans.length; i++) {
		System.out.print(ans[i]);
	}
}
}
