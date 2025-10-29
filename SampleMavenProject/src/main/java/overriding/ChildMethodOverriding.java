package overriding;

public class ChildMethodOverriding extends ParentMethodOverriding{
	
	public void display()
	{
		super.display();
		System.out.println("this is child method");
	}
	
	public void secondDisplay(int b)
	{
		super.secondDisplay(25);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildMethodOverriding co = new ChildMethodOverriding();
		co.display();
		co.secondDisplay(20);
		co.thirdDisplay("Ahila");

	}

	@Override
	public void thirdDisplay(String a) {
		// TODO Auto-generated method stub
		super.thirdDisplay("Raj");
		System.out.println(a);
	}

}
