package collectionpack;

import java.util.HashSet;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		Set <String> s = new HashSet <String>();
		s.add("Kerala");
		s.add("Tamilnadu");
		s.add("Karnataka");
		System.out.println(s); 
		
		//addAll() , contains() ,ContainsAll(), remove(),size(),clear(). Cannot perform index based
		
		Set <String> a = new HashSet <String>();
		a.add("blue");
		a.add("green");
		a.add("red");
		System.out.println(a);
		System.out.println(s.addAll(a));
		System.out.println(s);
		
		a.clear();
		System.out.println(a);
		System.out.println(a.isEmpty());
		
		s.add("Kerala");
		System.out.println(s);
	}

}
