package accessspecifierTwo;

import accessspecifier.Modifier;

public class AccessSpcfPrgm extends Modifier{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSpcfPrgm ap = new AccessSpcfPrgm();
		ap.proDisplay();
		ap.pubDisplay();
		//ap.defDisplay(); default method is not visible
		//ap.priDisplay(); private method is not visible
		
		Modifier mo = new Modifier();
		mo.pubDisplay();
		//mo.proDisplay();//not visible
	}

}
