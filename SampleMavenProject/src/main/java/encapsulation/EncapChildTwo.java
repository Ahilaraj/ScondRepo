package encapsulation;

public class EncapChildTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapParentTwo et = new EncapParentTwo();
		et.setMark(10);
		System.out.println(et.getMark());
		et.setGrade("A");
		System.out.println(et.getGrade());
	}

}
