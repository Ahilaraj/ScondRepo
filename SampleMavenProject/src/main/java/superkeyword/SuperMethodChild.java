package superkeyword;

public class SuperMethodChild extends SuperMethodParent{
	
	public void childDisplay()
	{
		super.parentDisplay();
		System.out.println("child method");
		//super.displayParent(20);
		this.displayChild();
	}
	
	public void displayChild()
	{
		super.displayParent(80);
		System.out.println("this is 2nd child method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperMethodChild sm = new SuperMethodChild();
		sm.childDisplay();
		//sm.parentDisplay();

	}

}
