package stringBufferAndStringBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeOrNot {

	public static void main(String[] args) throws IOException {

		//accept the string from the keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a string");
		String str = br.readLine();
		
		//store a copy of original string in temp
		String temp = str;
		
		//convert the string into StringBuffer
		StringBuffer sb = new StringBuffer(str);
		
		//reverse the string in StringBuffer
		sb.reverse();
		
		//convert the StringBuffer into string 
		str = sb.toString();
		
		//compare the original string available in temp with this reversed string
		if(temp.equalsIgnoreCase(str))
			System.out.println(temp+" is palindrome");
		else
			System.out.println(temp+" is not palindrome");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
