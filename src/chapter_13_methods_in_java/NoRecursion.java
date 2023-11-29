package chapter_13_methods_in_java;

public class NoRecursion {

	static long factorial(int num) {
		long fact = 1;
		while (num > 0) {
			fact = fact * num;
			num = num-1;
		}
		return fact;
	}

	public static void main(String[] args) {

		System.out.println("Factorial of 5: ");
		System.out.println(NoRecursion.factorial(6));
	}

}
