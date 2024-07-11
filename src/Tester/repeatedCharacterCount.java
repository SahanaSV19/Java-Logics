package Tester;

public class repeatedCharacterCount {
	public static void main(String[] args) {

		String str = "programming";
		
		for (int i = 0; i < str.length(); i++) {
			int answer = 0;
			for (int j = 0; j < str.length(); j++) {
				if (i!=j && str.charAt(i) == str.charAt(j)) {
					answer++;	
				}
			
			}
			if(answer>0)
				System.out.println(str.charAt(i)+" "+answer);
			
			}
		}
	}

