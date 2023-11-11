package chapter_13_methods_in_java;

public class InstanceVariablesAndLocalVariables {

	// x is instance variable
	private int x;

	// a is local variable
	void modify(int a) {
		x = a;
	}

	// we can access x, but not a
	void access() {
		System.out.println("x = " + x);
		// System.out.println("a = "+a);
	}

	public static void main(String[] args) {

		InstanceVariablesAndLocalVariables obj = new InstanceVariablesAndLocalVariables();
		obj.modify(10);
		obj.access();
	}

}
