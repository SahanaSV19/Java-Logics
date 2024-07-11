package Tester;

public class Sampleoutputinput {
public static void main(String[] args) {
	int arr[] = {1,2,3,5,6,8,9};
	int key=12;
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j <i; j++) {
			if(arr[i]+arr[j]==key && arr[i]!=arr[j])
			{
				System.out.println(arr[j]+" "+arr[i]);
			}
		}
		
	}
}
}
