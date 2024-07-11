package Tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program1 {
public static void main(String[] args) {
	List<Integer> l1=new ArrayList<Integer>();
	l1.add(9);
	l1.add(21);
	l1.add(3);
	l1.add(45);
	l1.add(5);
	l1.add(6);
	System.out.println(l1);
	Collections.sort(l1);
	System.out.println(l1);
}
}
