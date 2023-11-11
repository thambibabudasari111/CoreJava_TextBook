package collection_frameworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroupClass {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// to accept data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// create an array with size 5
		GroupOfObjectsIntoAnArray arr[] = new GroupOfObjectsIntoAnArray[5];

		// store data into an array
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter id: ");
			int id = Integer.parseInt(br.readLine());

			System.out.println("Enter name: ");
			String name = br.readLine();

			arr[i] = new GroupOfObjectsIntoAnArray(id, name);
		}

		System.out.println("\nThe employee data is: ");

		// display the data from the array
		for (int i = 0; i < arr.length; i++) {
			arr[i].displayData();
		}

	}

}
