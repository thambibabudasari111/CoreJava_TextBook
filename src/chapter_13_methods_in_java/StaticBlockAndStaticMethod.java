package chapter_13_methods_in_java;

public class StaticBlockAndStaticMethod {

	/*
	 * JVM executes a static block on a highest priority basis. This means JVM first
	 * goes to a static block even before it look for the main() method.
	 */
	static {
		System.out.println("static block");
	}

	public static void main(String[] args) {

		System.out.println("static method");
	}

}
