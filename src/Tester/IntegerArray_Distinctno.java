package Tester;

public class IntegerArray_Distinctno {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 4, 5, 6, 7, 7, 8 };
		distinctCharacter(arr);
	}

	static void distinctCharacter(int[] no) {
		for (int i = 0; i < no.length; i++) {
			int count = 0;
			for (int j = 0; j < no.length; j++) {
				if (i != j && no[i] == no[j]) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.print(no[i]+" ");
			}
		}
	}
}
