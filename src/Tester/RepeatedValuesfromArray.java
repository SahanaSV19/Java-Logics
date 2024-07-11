package Tester;

public class RepeatedValuesfromArray {
public static void main(String[] args) {
	int[] arr= {1,2,2,3,4,4,5,6,6,7};
	for (int i = 0; i < arr.length; i++) {
		boolean flag=true;
		for (int j = 0; j < arr.length; j++) {
			if(i!=j && arr[i]==arr[j])
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
}
