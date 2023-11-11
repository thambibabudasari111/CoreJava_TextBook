package stringBufferAndStringBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringBufferMethods {

	public static void main(String[] args) throws IOException {

		//To compose full name of a person
		
		//Create empty string buffer object
		StringBuffer sb = new StringBuffer();
		
		//to accept data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//accept surname
		System.out.println("Enter sur name");
		String surname = br.readLine();
		
		//accept middle name
		System.out.println("Enter middle name");
		String middleName = br.readLine();
		
		//accept lastname
		System.out.println("Enter last name");
		String lastname = br.readLine();
		
		
		//append surname to sb
		sb.append(surname);
		
		//append last name to sb
		sb.append(lastname);
		
		//display the name till now
		System.out.println("Name: "+sb);
		
		//insert middle name after nth character of surname in sb
		int n=surname.length();
		
		sb.insert(n, middleName);
		
		//display the full name
		System.out.println("Full name: "+sb);
		
		//reverse the full name
		sb.reverse();
		System.out.println("reversed full name: "+sb);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
