package Tester;

import java.util.ArrayList;
import java.util.List;

public class doubleArraytoArrayList {
public static void main(String[] args) {
	double[] arr= {20.3,34.5,45.6};
	List l2=Convert(arr);
	System.out.println(l2);
}

private static List Convert(double[] arr) {
	// TODO Auto-generated method stub
	List l1= new ArrayList();
	for (int i = 0; i < arr.length; i++) {
		l1.add(arr[i]);
	}
	return l1;
}
}
