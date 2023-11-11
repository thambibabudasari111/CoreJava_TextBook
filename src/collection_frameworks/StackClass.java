package collection_frameworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackClass {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// create an empty stack to contain Integer objects
		Stack<Integer> st = new Stack();

		int choice = 0;
		int position, element;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// display the menu as long as the user choice <4
		while (choice < 4) {
			System.out.println("STACK OPERATIONS");
			System.out.println("1 push an element");
			System.out.println("2 pop an element");
			System.out.println("3 search an element");
			System.out.println("4 exit");
			System.out.println("Your choice: ");

			choice = Integer.parseInt(br.readLine());

			// perform a task depending on user choice
			switch (choice) {

			case 1:
				System.out.println("Enter an element: ");
				element = Integer.parseInt(br.readLine());

				// int type element is converted into Integer object and then pushed into the
				// stack
				st.push(element);
				break;

			case 2: // the top-most Integer object is popped
				Integer obj = st.pop();
				System.out.println("Popped " + obj);
				break;

			case 3:
				System.out.println("Which element? ");
				element = Integer.parseInt(br.readLine());
				// int type element is converted into Integer object and then searched in the
				// stack
				position = st.search(element);

				if (position == -1)
					System.out.println("Element not found");
				else
					System.out.println("Position: " + position);
				break;

			default:
				// come out if user choice is other than 1,2, or 3
				return;
			}

			// view the contents of stack
			System.out.println("Stack contents: " + st);

		}

	}

}
