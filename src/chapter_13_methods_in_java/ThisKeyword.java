package chapter_13_methods_in_java;

public class ThisKeyword {

	/*
	 * this - refers to all the members of present class.
	 * 
	 * We can use this keyword for instance variables, constructors, and methods of
	 * the class
	 */

	// x is instance variable
	private int x;

	// default constructor
	ThisKeyword() {
		this(50); // call present class parameterized constructor and send 50
		this.access(); // call present class method
	}

	ThisKeyword(int x)

	{
		this.x = x; // refer present class instance variable
	}

	// method access
	void access() {
		System.out.println("x = " + x);
	}

	public static void main(String[] args) {

		ThisKeyword obj = new ThisKeyword();

	}

}
