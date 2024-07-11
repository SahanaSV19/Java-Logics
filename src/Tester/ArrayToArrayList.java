package Tester;

import java.util.ArrayList;
import java.util.List;

public class ArrayToArrayList {
public static void main(String[] args) {
	int[] arr= {10,20,30,40,50};
	Object[] abb = CopyToObjectArray(arr);
	List l2=Convert(abb);
	System.out.println(l2);
}
private static Object[] CopyToObjectArray(int[] arr) {
	// TODO Auto-generated method stub
	Object[] abb = new Object[arr.length];
	for (int i = 0; i < arr.length; i++) {
		abb[i]=arr[i];
	}
	return abb;
}
//Convert method is called generic method 
//here we are upcasting to List there by hiding which type of list(ArrayList) it is ---this is called as abstraction
private static List Convert(Object[] arr) {
	// TODO Auto-generated method stub
	List l= new ArrayList();
	for (int i = 0; i < arr.length; i++) {
		l.add(arr[i]);
	}
	return l;
}
}
