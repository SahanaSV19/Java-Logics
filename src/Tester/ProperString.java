package Tester;

public class ProperString {
public static void main(String[] args) {
	String str1="a4b5c2a2";
	String str2=str1;
	String str3="";
	int no1;
	int no2;
	int no3;
	int m,n;
	for (int i = 0; i < str1.length(); i=i+2) {
		for (int j = i+2; j < str1.length(); j=j+2) {
			if(str1.charAt(i)==str1.charAt(j))
			{
				no1=Character.getNumericValue(str1.charAt(i+1));
				no2=Character.getNumericValue(str1.charAt(j+1));
				no3=no1+no2;	
			
				str2=str2.replaceAll(""+str2.charAt(i+1),String.valueOf(no3));
			}
		}
	}
	System.out.println(str2);
	String dummy;
	String strmain;
	for (int i = 0; i < str2.length(); i=i+2) {
		for (int j = i+2; j < str2.length(); j=j+2) {
			if(str2.charAt(i)==str2.charAt(j))
			{
//				
//				dummy=str2.charAt(i)+""+str2.charAt(i+1);
//				System.out.println(dummy);
				m=Character.getNumericValue(str2.charAt(i+1));
				n=Character.getNumericValue(str2.charAt(j+1));
				if(m>n)
				{
					dummy=str2.charAt(j)+""+str2.charAt(j+1);
					strmain=str2.replaceAll(dummy, "");	
					stringPattern(strmain);
				}
			}
		}}
}

private static void stringPattern(String strmain) {
	char[] arr =strmain.toCharArray();
	int no;
	String str1="";
	for (int i = 1; i < arr.length; i=i+2) {
		no = Character.getNumericValue(arr[i]);
		while(no>0)
		{
			str1+=arr[i-1];
			no--;
		}
	}
	System.out.println(str1);
}
}