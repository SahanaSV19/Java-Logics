package Tester;

public class StringtoChararr_withoutusinginbuilt {

	public static void main(String[] args) {
		String str = "programming";
		char[] ch=new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			ch[i]=str.charAt(i);
			
	}
		for(int j=0;j<ch.length;j++)
		{
			System.out.print(ch[j]);
		}
		
		
}
}
