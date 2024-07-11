package Tester;

public class Stringsmethod {
public static void main(String[] args) {
	// i/p -> java programming
	
/*------------------------------------*/
	// o/p
	
	//j
	//av
	//a p
	//rogr
	//ammin
	//g
	String str = "Sah&&ana";
	String str2 ="";
	for(int i=0;i<=str.length()/2;i++)
	{
		str2+=str.charAt(i);
	}
	System.out.println(str2);
	str.split(str2);
	System.out.println(str);
	str= str.concat(str2);
	System.out.println(str);
	str.replace('h', 'n');
	str.replaceAll("&&", "");
	String str3 = str.substring(3);
	String str4=str.substring(0, 3);
	String str5 =str3.concat(str4);
	System.out.println(str5);
	System.out.println(str5.contains(str3));
	System.out.println(str5.isEmpty());
	System.out.println(str2.toLowerCase());
	System.out.println(str2.toUpperCase());
	System.out.println(str5.startsWith(str3));
	System.out.println(str5.indexOf('a'));
}
}
