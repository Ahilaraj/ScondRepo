package multipleInheritance;

public class ChildInterface implements Interface1 , Interface2 , Interface3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildInterface ch = new ChildInterface();
		ch.intefaceOneDisplay();
		ch.intefaceTwoDisplay();
		ch.intefaceThreeDisplay();

	}

	@Override
	public void intefaceThreeDisplay() {
		// TODO Auto-generated method stub
		System.out.println("this is 3rd interface");
	}

	@Override
	public void intefaceTwoDisplay() {
		// TODO Auto-generated method stub
		System.out.println("this is 2nd interface");
		
	}

	@Override
	public void intefaceOneDisplay() {
		// TODO Auto-generated method stub
		System.out.println("this is first interface");
		
	}

}
