package Tester;
//Reveres a string without using charAt(),length(),length
public class ReverseStringwithout {
//public static void main(String[] args) {
//	String str ="java";
//	String str2="";
//	char[] arr = str.toCharArray();
//	for(char s :arr)
//	{
//		str2=s+str2;
//	}
//	System.out.println(str2);
//}
public static void main(String[] args) {
	

String str = "java";
int count=0;
char[] ch = str.toCharArray();
for(char c:ch)
{
	count++;
}
for(int i=count-1;i>=0;i--)
{
	System.out.print(ch[i]);
}
}
//both the ways are possible
}

