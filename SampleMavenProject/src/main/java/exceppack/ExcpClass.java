package exceppack;

public class ExcpClass {

	public static void main(String[] args) {
	try
	{// TODO Auto-generated method stub
	int a = 10;
		int b = 0;
		int c = a/b;
		System.out.println(c); 
	}
	
	catch (ArithmeticException ae)
	{
		System.out.println("exception is handled");
	}

	
	finally
	{
		System.out.println("this is an important code");
	}
	
	//System.out.println("this is outside ");
	
		
		/* int a []= {1,2 ,3,4 };
		
		for (int i = 0; i<5 ; i++)
		{
			System.out.println(a[i]);
		}  */
		
	/*	String n = null;
		
		System.out.println(n.length()); */
	}

}
