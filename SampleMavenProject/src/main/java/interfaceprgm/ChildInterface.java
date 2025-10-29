package interfaceprgm;

public class ChildInterface implements Parentinterface {

	public static void main(String[] args) {
		
		ChildInterface cf = new ChildInterface(); 
		cf.display();
		cf.defaultDisplay();
		Parentinterface.statDisplay();
		cf.childMethod();
		
		System.out.println(cf.a);
		
		 Parentinterface pf = new ChildInterface(); // using reference
		 pf.defaultDisplay();
		 pf.display();
		 
		 
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("interface method from parent");
		
	}
	
	public void childMethod()
	{
		System.out.println("This is child class method");
	}

}
