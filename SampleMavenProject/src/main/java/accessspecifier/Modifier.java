package accessspecifier;

public class Modifier {
	
	public void pubDisplay()
	{
		System.out.println("public method");
	}
	
	private void priDisplay()
	{
		System.out.println("this is private method");
	}
	
	protected void proDisplay()
	{
		System.out.println("this is protected method");
	}
	
	void defDisplay()
	{
		System.out.println("this is default method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modifier mo = new Modifier();
		mo.defDisplay();
		mo.priDisplay();
		mo.proDisplay();
		mo.pubDisplay();
	}

}
