package strings;

public class StringSplit {

	public static void main(String[] args) {

		//create a string str which is to be broken
		String str = "Hello, this is a book on Java";
		
		//declare a string array s to split the pieces
		String s[];
		
		//split the string where a space is found
		s = str.split(" ");
		
		//display the pieces from s
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}

}
