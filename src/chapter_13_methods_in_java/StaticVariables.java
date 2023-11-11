package chapter_13_methods_in_java;

public class StaticVariables {

	/*
	 * A class variable (static variable) will have only one copy in memory and that
	 * is shared by all the objects. any modification to it will also affect other
	 * objects.
	 * 
	 * The execution sequence of JVM is the process where JVM executes first of all
	 * any static blocks in the Java program. Then it executes the static method
	 * (remember main() is a static method) and then it creates any objects needed
	 * by the program. Finally, it executes the instance methods.
	 */

	// class variables or static vars
	static int x = 10;

	// display the variable
	static void display() {
		System.out.println("X = " + x);
	}

	public static void main(String[] args) {

		StaticVariables obj1, obj2;

		obj1 = new StaticVariables();
		obj2 = new StaticVariables();

		// increment x in obj1
		++obj1.x;
		System.out.println("x in obj1 " + x);
		obj1.display();

		// display x in obj2
		System.out.println("x in obj2 " + x);
		obj2.display();

	}

}
