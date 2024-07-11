package Tester;

public class instanceInitialization {
	{
		System.out.println("Hey i am IIB");
	}
	{
		System.out.println("Hey i am IIB2");
	}
	{
		System.out.println("Hey i am IIB3");
	}
public static void main(String[] args) {
	System.out.println("Main starts");
	instanceInitialization initialization = new instanceInitialization();
	System.out.println("Main ends");
}
}
