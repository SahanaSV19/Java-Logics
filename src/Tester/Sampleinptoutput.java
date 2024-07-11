package Tester;

public class Sampleinptoutput {
public static void main(String[] args) {
	int arr[]= {2,3,9,2,2};
	int count=0;
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			if(arr[i]==arr[j])
			{
				count++;
			}
		}
		if(count>arr.length/2)
		{
			System.out.println(arr[i]);
		}
		else
		{
			System.out.println("-1");
		}
	}
	
}
}
