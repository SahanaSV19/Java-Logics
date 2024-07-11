package Tester;

public class nthprimeno {
	public static void main(String[] args) {
		int n = 3;
		int nth = 4;
		int count = 0;
		for (int i = n; i <= 100; i++) {
			int no = i;
			boolean flag = true;
			for (int j = 2; j < no; j++) {
				if (no % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag==true) {
				count++;
				if (count == nth) {
					System.out.println(no);
					break;
				}
			}
		}
	}
}
