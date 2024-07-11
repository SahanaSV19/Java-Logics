package Tester;

public class StackUnwinding {
	static void disp1()
	{
		int i=1/0;
	}
	static void disp2() {
		disp1();
	}
	static void disp3() {
		disp2();
	}
	public static void main(String[] args) {
		try {
			disp3();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("handled");
		}
		
	}
}
