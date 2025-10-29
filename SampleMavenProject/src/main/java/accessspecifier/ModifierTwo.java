package accessspecifier;

public class ModifierTwo extends Modifier{

	public static void main(String[] args) {
		
		ModifierTwo mt = new ModifierTwo();
		mt.defDisplay();
		mt.proDisplay();
		mt.pubDisplay();
		//mt.priDisplay(); private method can not accessible from out side class
	}

}
