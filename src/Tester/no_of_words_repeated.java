package Tester;

public class no_of_words_repeated {
public static void main(String[] args) {
	String str = "java is java java programming java language java";
	String[] str1= str.split(" ");
	int count=-1;
	for(int i =0;i<str1.length;i++)
	{
//		System.out.println(str1[i]);
		for(int j=0;j<str1.length;j++)
		{
		if(str1[i].equals(str1[j]))
		{
			count++;
		}
    }
		System.out.println(str1[i]+"->"+count);
}
}
}
