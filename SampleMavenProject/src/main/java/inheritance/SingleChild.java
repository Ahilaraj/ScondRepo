package inheritance;

public class SingleChild extends SingleParent {
	
	public void childDisplay()
	{
		System.out.println("this is child display");
	}

	public static void main(String[] args) {
		SingleChild sc = new SingleChild();
		sc.childDisplay();
		sc.display();
		SingleParent sp = new SingleParent();
		sp.display();
		
	}

}
