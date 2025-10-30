package exceppack;

public class ThrowThrows {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int age = 16;
		if (age > 18)
		{
			System.out.println("eligible");
		}
		
		else
		{
			throw new Exception ("not eligible");
		
		}
	}

}
