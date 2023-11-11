package chapter_13_methods_in_java;

public class StaticMethodAccessStaticVars {

	// static vars
	static int x = 55;

	// static method accessing x value
	static void access() {
		System.out.println("x = " + x);
	}

	public static void main(String[] args) {

		StaticMethodAccessStaticVars.access();

	}

}
