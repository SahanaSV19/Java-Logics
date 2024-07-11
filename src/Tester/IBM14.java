package Tester;

import java.util.Scanner;

public class IBM14 {
	
	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc = new Scanner(System.in);
	        int size=sc.nextInt();
	        int[] arr = new int[size];
	        for(int i=0;i<size;i++){
	            arr[i]=sc.nextInt();
	        }
	        int count=0;
	        int checkno=0;
	        for(int j=0;j<size;j++)
	        {
	             checkno=0;
	            for(int k=j;k<size;k++)
	            {
	                checkno+=arr[k];
	                if(checkno<0)
	                {
	                    count++;
	                    System.out.print(arr[k]+" ");
	                }
	            }
	            System.out.println("");
	        }
	        System.out.println("OUTPUT: "+count);
	    }
}
