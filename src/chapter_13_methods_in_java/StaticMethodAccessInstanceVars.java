package chapter_13_methods_in_java;

public class StaticMethodAccessInstanceVars {

	// instance vars
	int x;

	// parameterized constructor
	StaticMethodAccessInstanceVars(int x) {
		this.x = x;
	}

	// static method accessing x value
	static void access() {
		// System.out.println("X = "+x);
	}

	public static void main(String[] args) {

		StaticMethodAccessInstanceVars obj = new StaticMethodAccessInstanceVars(10);
		System.out.println(obj.x);
		StaticMethodAccessInstanceVars.access();

	}

}
