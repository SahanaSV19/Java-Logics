package Tester;

public class Thread3 {
public static void main(String[] args) {
	Sample1 sample = new Sample1();
	Thread thread = new Thread(sample);
	thread.run();
	
	Demo1 demo = new Demo1();
	Thread thread1 = new Thread(demo);
	thread1.start();
}
}
class Sample1 extends Thread
{
	public void run(){
		for (int i = 1; i <=10; i++) {
			System.out.println(i);
		}
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
class Demo1 implements Runnable
{
	public void run() {
		for (int i = 101; i <=110; i++) {
			System.out.println(i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
