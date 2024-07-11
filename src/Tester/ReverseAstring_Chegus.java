package Tester;

public class ReverseAstring_Chegus {
public static void main(String[] args) {
	String str1="ab$c#de%";
	char [] ch1=new char[str1.length()];
	char[] ch = str1.toCharArray();
	String str3=str1.replace("$","");
	String str=str3.replace("%","");
	String str4=str.replace("#","");
	int j=str4.length()-1;
	for (int i = 0; i <ch.length; i++) {
		if(ch[i]<'a'|| ch[i]>'z')
		{
			ch1[i]=ch[i];
		}
		else 
		{
			ch1[i]=str4.charAt(j);
			j--;
		}
	}
	for (int i = 0; i < ch1.length; i++) {
		System.out.print(ch1[i]);
	}	
}
}
