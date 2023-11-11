package strings;

public class StringMethods {

	public static void main(String[] args) {

		//create a string in 3 ways
		String s1 = "A book on Java";
		
		String s2 = new String ("I like this text book");
		
		char arr[] = {'t','h','a','m','b','i','b','a','b','u'};
		
		String s3 = new String(arr);
		
		//display all the strings
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//find the length of first string
		System.out.println("length of s1= "+s1.length());
		
		//concatenate two strings
		System.out.println("s1 and s2 joined: "+s1.concat(s2));
		
		//concatenate three strings with +
		System.out.println(s1+" from "+s3);
		
		//test if a string s1 starts with A
		boolean x = s1.startsWith("A");
		
		if(x) System.out.println("S1 starts with \'A\'");
		else System.out.println("s1 does not start with \'A\'");
		
		//extract substring from s2, starting from 0th char to 6th char
		String p = s2.substring(0, 6);
		System.out.println(p);
		
		//convert s1 into upper case and lower case
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
	
	}

}
