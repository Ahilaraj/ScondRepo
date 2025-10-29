package interfaceprgm;

public interface Parentinterface {
	
	public static final int a = 90;
	int b = 10;
	
	

	public void display ();
	
	public static void statDisplay()
	{
		System.out.println("static method");
	}
	
	default void defaultDisplay()
	{
	
		System.out.println("default method");
	}
}
