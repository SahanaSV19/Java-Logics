package Tester;

public class FibonacciTriangle {
public static void main(String[] args) 
{
	int fib1=0;
	int fib2=1;
	int fib3;
	int no =10;
	int[] arr = new int[no];
	arr[0]=fib1;
	arr[1]=fib2;
	int count=0;
//	System.out.println(fib1);
//	System.out.println(fib2);
	for (int i = 2; i < no; i++) {
		fib3=fib2+fib1;
		fib1=fib2;
		fib2=fib3;
//		System.out.println(fib3);
		arr[i]=fib3;
	}
	for (int i = 0; i < arr.length; i++) {
		
		for (int j = 0; j < i; j++) {
			
			System.out.print(arr[count++]+" ");
		}
		System.out.println("");
	}
	
}
}

