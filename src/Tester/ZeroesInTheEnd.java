package Tester;

public class ZeroesInTheEnd {
public static void main(String[] args) {
	int temp;
	int no =0;
	int arr[]= {1,2,0,0,3,0,4,5,0,0};
	for (int i = 0; i < arr.length-1; i++) {
		
		for (int j = 0; j < arr.length-1; j++) {
			if(arr[j]==no)
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		
		
	}
	for (int i = 0; i <arr.length; i++) {
		System.out.print(arr[i]);
	}
}
}
