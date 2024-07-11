package Tester;

public class fizzbuzz {
public static void main(String[] args) {
	String ars="7";
	int no = Integer.parseInt(ars);
	for (int i = 1; i <=no; i++) {
		System.out.println(Main(String.valueOf(i)));
	}
	
}
static String Main(String ars)
{
	int i=Integer.parseInt(ars);
	 {
		if(i%3==0&&i%5!=0)
		{
			return "Fizz";
		}
		else if(i%5==0&&i%3!=0)
		{
			return "Buzz";
		}
		else if(i%3==0&&i%5==0)
		{
			return "FizzBuzz";
		}
		else
		{
			String ans=""+i;
			return ans;
		}
	}
}
}
