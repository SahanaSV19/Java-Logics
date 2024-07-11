package Tester;

public class JMRCompany {
	
	public static boolean findSum(int[] arr, int no)
	{	int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==2)
			{
				count++;
			}
		}
		if(count*2==no)
		{
			return true;
		}
		else
		{
		return false;
	}
	}
public static void main(String[] args) {
	int[] a = {2,2,3,2,4,2};
	boolean ans = findSum(a,8);
	System.out.println(ans);
}
}
