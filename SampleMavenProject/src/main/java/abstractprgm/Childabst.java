package abstractprgm;

public class Childabst extends Parentabst{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parentabst pa = new Childabst();
		pa.display();
		Childabst ca = new Childabst();
		ca.displaySecond();
		
	}

	@Override
	public void display() {
		System.out.println("parent abst method");
		
	}
	
	public void displaySecond()
	{
		System.out.println("child method");
	}

}
