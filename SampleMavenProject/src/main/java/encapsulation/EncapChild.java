package encapsulation;

public class EncapChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapParent ep = new EncapParent();
		ep.setAge(19);
		System.out.println(ep.getAge());
		ep.setName("ram");
		System.out.println(ep.getName());
	}

}
