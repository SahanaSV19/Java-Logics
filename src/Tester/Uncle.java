package Tester;

class Aunty{
	String job() {
		return "Development job";
	}
}
public class Uncle {
	
public static void main(String[] args) {
Aunty aunty = new Aunty();
Dinga.needjob(aunty);
Dingi.needjob(aunty);
}
}
class Dinga{
	static void needjob(Aunty a1)
	{
		String s=a1.job();
		System.out.println(s+" for dinga");
	}
}
class Dingi{
	static void needjob(Aunty a1)
	{
		System.out.println(a1.job()+" for dingi");
	}
}
