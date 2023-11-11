package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinearSearch {

	//search for a string - linear search
	public static void main(String[] args) throws NumberFormatException, IOException {

		//to accept the data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//ask how many string
		System.out.println("How many strings?");
		int n = Integer.parseInt(br.readLine());
		
		
		//create a string type array with size n
		String str[] = new String[n];
		
		//store string into str[]
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter a string: ");
			str[i] = br.readLine(); 
		}
		
		//accept the string to search
		System.out.println("Enter the string to search: ");
		String search = br.readLine();
		
		//take a boolean variable
		boolean found = false;
		
		//search for the string in the str[]
		for(int i=0; i<n; i++)
		{
			if(search.equals(str[i]))
			{
				System.out.println("found at position: "+(i+1));
				found=true; //string found
			}
		}
		
		//if not found display message
		if(!found)
			System.out.println("searched string not found");
	}

}
