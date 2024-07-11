package Tester;

//ArmStrong Number is sum of cube of digits
public class ArmstrongNo1 {
	public static void main(String[] args) {
		for (int i = 0; i <= 1000; i++) {
			int no = i;
			int copy = no;
			int sum = 0;
			while (no != 0) {
				int rem = no % 10;
				sum += rem * rem * rem;
				no = no / 10;
			}
			if (copy == sum)
				System.out.print(copy+" ");
			
		}
	}

}
