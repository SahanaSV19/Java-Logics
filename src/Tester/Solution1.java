package Tester;

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		double d = scan.nextDouble();
		Scanner sc2 = new Scanner(System.in);
		String s =sc2.nextLine();
		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
	}
}


//import java.util.Scanner;
//
//public class Solution {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int i = scan.nextInt();
//        double d = scan.nextDouble();
//        String s ="";
//        while(scan.hasNext())
//        {
//        s+= scan.nextLine();
//        }
//        // Write your code here.
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);
//    }
//}