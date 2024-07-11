package Tester;

public class distinctNumberCount {
public static void main(String[] args) {
	int[] arr= {1,2,2,3,3,4,4,5,6,6,7};
	int[] count=new int[57];
	
	for (int i = 0; i < arr.length; i++) {
		
			int no = arr[i];
			count[no]++;		
		}
	for (int j = 0; j < count.length; j++) {
		if(count[j]>1)
		{
			System.out.println((int)j+"-->"+count[j]);
	}
		
	}
}
}
