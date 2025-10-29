package stringName;

public class ExampleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Ahila";
		System.out.println(s);
		String n = new String ("hello");
		System.out.println(n);
		//charAt -> is used to return character in a string based on index
		char c1 = s.charAt(2);
		System.out.println(c1);
		// length () -> to return the size of string
		System.out.println(s.length());
		//concat -> add 2 strings
		System.out.println(s.concat(n));
		System.out.println(s);
		//contains() -> to check whether a word or character present in a string. if value present it return true value else return false value
		System.out.println(s.contains("l"));
		System.out.println(s.contains(n));
		//toUppercase()-> convert lowercase to capital
		System.out.println(s.toUpperCase());
		//toLowercase() -> convert capital to lowercase
		System.out.println(s.toLowerCase());
		//isEmpty() -> to check whether a string is empty or not. if string is empty return true else return false
		System.out.println(s.isEmpty());
		String g = "";
		System.out.println(g.isEmpty());
		//value() -> to convert any datatype to string
		int a = 45;
		System.out.println(String.valueOf(a));
		//equals 
		String v = "java";
		String j = "Java";
		String k = "java";
		String k1 = "Selenium";
		System.out.println(v.equals(j)); //false
		System.out.println(v.equals(k)); //true
		System.out.println(v.equals(k1)); // false
		//equalsIgnore -> to ignore case , if it is small letter or capital
		System.out.println(v.equalsIgnoreCase(j)); // true
		// == operator
		System.out.println(v==k);//true
		String k2 = new String ("java");
		System.out.println(v==k2); //false ->checking reference
	}
	

}
