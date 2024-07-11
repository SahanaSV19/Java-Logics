package Tester;

public class XylemNo {
	public static void main(String[] args) {
		int no = 4665;
		String no1 = "" + no;
		int MeanSum = 0;
		int extremeSum;
		int arr[] = new int[no1.length()];
		for (int i = 0; i < arr.length; i++) {
			while (no != 0) {
				int rem = no % 10;
				arr[i] = rem;
				no = no / 10;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

		extremeSum = arr[0] + arr[arr.length - 1];
		for (int i = 1; i < arr.length - 1; i++) {

			MeanSum += arr[i];
		}
		if (extremeSum == MeanSum) {
			System.out.println("Xylem");
		} else {
			System.out.println("Not a Xylem");
		}
	}
}
