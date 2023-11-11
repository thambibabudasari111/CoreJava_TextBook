package strings;

public class CopyStringToArray {

	public static void main(String[] args) {

		String str = "Hello, this is a book on Java";
		
		char arr[] = new char[20];
		
		//copy the string str to array, from 7th to 21th position
		str.getChars(7, 21, arr, 0);
		System.out.println(arr);
	}

}
