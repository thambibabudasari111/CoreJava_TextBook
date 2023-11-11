package chapter_13_methods_in_java;

public class InstanceVariables {

	/*
	 * Instance variables will have a separate copy in each object, when the value
	 * of an instance variable is modified in an object, it does not affect the
	 * instance variable in other objects.
	 * 
	 * The execution sequence of JVM is the process where JVM executes first of all
	 * any static blocks in the Java program. Then it executes the static method
	 * (remember main() is a static method) and then it creates any objects needed
	 * by the program. Finally, it executes the instance methods.
	 */
	// instance variable
	int x = 10;

	// display the variable
	void display() {
		System.out.println(x);
	}

	public static void main(String[] args) {

		// create two references
		InstanceVariables obj1, obj2;
		obj1 = new InstanceVariables();
		obj2 = new InstanceVariables();

		// increment the x in obj1
		++obj1.x;
		System.out.println("x in obj1: ");
		obj1.display();

		// display the x in obj2
		System.out.println("x in obj2: ");
		obj2.display();

	}

}
