package Tester;

public class THread4 {
	public static void main(String[] args) {
		Thread thread=Thread.currentThread();
		System.out.println(thread.getId());
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		thread.setName("Sahana thread");
		thread.setPriority(10);
		System.out.println(thread.getId());
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
	}
}
