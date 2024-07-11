package Tester;

public class Ramarepeated {
public static void main(String[] args) {
	String str="Rama go to school Rama eat food Rama do homework";
	String[] s1=str.split(" ");
	int count=0;
	for(int i=0;i<s1.length;i++)
	{
		if(s1[i].equals("Rama"))
		{
			count++;
		}
	}
	System.out.println("Rama is repeated "+count+" times");
}
}
