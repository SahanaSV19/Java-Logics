package Tester;

public class distinctCharacter {
	public static void main(String[] args) {

		String str = "programming";
		
		for (int i = 0; i < str.length(); i++) {
			int answer = 0;
			for (int j = 0; j < str.length(); j++) {
				if (i!=j && str.charAt(i) == str.charAt(j)) {
					answer++;
					break;
				}
			}
			if (answer == 0) {
				System.out.print(str.charAt(i));
			}
		}
	}
}