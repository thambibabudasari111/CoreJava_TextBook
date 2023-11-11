package strings;

public class StrCompareUsingEqualsMethod {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = new String("Hello");
		
		if(s1.equals(s2))
			System.out.println("Both are same");
		else
			System.out.println("Not same");
	}

}
