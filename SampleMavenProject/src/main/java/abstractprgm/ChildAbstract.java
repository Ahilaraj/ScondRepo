package abstractprgm;

public class ChildAbstract extends ParentAbstract{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ParentAbstract ca = new ChildAbstract();
		ca.display();
		
		System.out.println(ca.paraDisplay(10));
		ca.displayNormal();

	}

	@Override
	public void display() {

		System.out.println("this is abstract method");
		
		
	}

	@Override
	public int paraDisplay(int a) {
		// TODO Auto-generated method stub
		return a;
	}

}
