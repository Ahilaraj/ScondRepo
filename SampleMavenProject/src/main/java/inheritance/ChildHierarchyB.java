package inheritance;

public class ChildHierarchyB extends ParentHierarchi{

	
	public void displayChildB()
	{
		System.out.println("this is child b of parent hierarchy");
	}
	public static void main(String[] args) {
		
		ChildHierarchyB cb = new ChildHierarchyB();
		cb.displayChildB();
		cb.displayParentHier();
		

	}

}
