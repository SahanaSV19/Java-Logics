package Tester;

import java.util.ArrayList;

public class ArrayListToArray {
public static void main(String[] args) {
	ArrayList l1 = new ArrayList();
	l1.add(40);
	l1.add(20);
	l1.add(30);
	System.out.println(l1);
	int[] arr = new int[l1.size()];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=(Integer) l1.get(i);
	}
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
}
}
