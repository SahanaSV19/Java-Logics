package Tester;

public class DecimaltoBinary {
public static void main(String[] args) {
	int no=19;
	int binary[] = new int[40];
	int index=0;
	while(no>0)
	{
		binary[index++]=no%2;
		no=no/2;
	}
	for (int j = index-1;j>=0;j--){
		System.out.print(binary[j]);
	}
	
}
}
