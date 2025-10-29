package superkeyword;

public class SuperChild extends SuperInheritanceParent {
	
	String col = "Blue";
	
	public void display()
	{
		
		System.out.println(super.col);
	}

	public static void main(String[] args) {
		
		SuperChild sc = new SuperChild();
	
		System.out.println(sc.col);
		
		sc.display();

	}

}
