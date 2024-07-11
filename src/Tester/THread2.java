package Tester;

public class THread2 {
public static void main(String[] args) {
	Demo demo = new Demo();
	Thread thread = new Thread(demo);
	thread.start();
	Sample sample = new Sample();
	Thread thread2 = new Thread(sample);
	thread2.start();
}
}
class Demo extends Thread
{
	public void run() {
		System.out.println("Hello");
	}
}
class  Sample extends Thread
{
	public void run() {
		System.out.println("Hi");
	}
}
