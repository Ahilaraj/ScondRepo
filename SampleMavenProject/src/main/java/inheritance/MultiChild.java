package inheritance;

public class MultiChild  extends MultiIntermediate{
	
	public void displayMulChild()
	{
		System.out.println("this is Multi child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiChild mc = new MultiChild();
		mc.displayMulChild();
		mc.display();
		mc.multiDisplay();
		

	}

}
