package Tester;
public class Mainclass3{
	public static void main(String[] args) {
		try {
			submit();
		} catch (Marriageexception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMess());
		}
	}

	private static void submit() throws Marriageexception {
		int age=19;
		if(age>21)
		{
			System.out.println("Sukha jeevana");
		}
		else
		{
			 throw new Marriageexception("Child chapathi");
			
		}
		
	}
}
class Marriageexception extends Exception
{
	String mess;
	public Marriageexception(String mess)
	{
		this.mess= mess;
	}
	public String getMess() {
		return mess;
	}
}