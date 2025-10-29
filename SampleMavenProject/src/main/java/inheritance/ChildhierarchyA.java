package inheritance;

public class ChildhierarchyA extends ParentHierarchi{
	
	public void displayChildA()
	{
		System.out.println("this is child A of parent hierarchy");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildhierarchyA ca = new ChildhierarchyA();
		ca.displayChildA();
		ca.displayParentHier();
	}

}
