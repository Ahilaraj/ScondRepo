package aggregation;

public class ChildAggregation {
	
	String city;
	String state;
	ParentAggregation ref;
	
	public ChildAggregation(String city, String state, ParentAggregation ref) 
	{
		this.city = city;
		this.state = state;
		this.ref = ref;
	}
	
	public void display()
	{
		System.out.println(city + "" + state);
		System.out.println(ref.age + " "+ ref.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentAggregation pa = new ParentAggregation(10 , "ramu");
		ChildAggregation ca = new ChildAggregation("adoor","Kerala", pa);
		ca.display();

	}

}
