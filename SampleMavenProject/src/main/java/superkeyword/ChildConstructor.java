package superkeyword;

public class ChildConstructor extends ParentConstructor{
	
	public ChildConstructor()
	
	{
		super("Ahila");
		//super();//invoking parent class constructor
		System.out.println("this is child constructor");
	}
	
	public ChildConstructor(int a)
	{
		this("raj");
		
		System.out.println(a);
	}
	public ChildConstructor(String n)
	{
		
		//super();
		System.out.println(n);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildConstructor cc = new ChildConstructor(); 
		ChildConstructor c1 = new ChildConstructor(20);

	}

}
