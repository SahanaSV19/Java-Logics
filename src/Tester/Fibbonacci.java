package Tester;

public class Fibbonacci {
public static void main(String[] args) {
	int no1=0;
	int no2=1;
	int no3;
	int n=10;
	for (int i = 0; i <n; i++) {
		System.out.print(no1+" ");
		no3=no1+no2;
		no1=no2;
		no2=no3;
	}
}
}
