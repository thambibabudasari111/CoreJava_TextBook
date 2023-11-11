package chapter_13_methods_in_java;

public class WithoutParametersAndReturnType {

	// instance variables
	private double num1, num2;

	// parameterized constructor
	WithoutParametersAndReturnType(double x, double y) {
		num1 = x;
		num2 = y;
	}

	// method to calculate sum of num1, num2
	// this method doesn't accept any values and doesn't return result
	void sum() {
		double res = num1 + num2;
		System.out.println("sum = " + res);
	}

	public static void main(String[] args) {

		WithoutParametersAndReturnType obj = new WithoutParametersAndReturnType(10.23, 21.42);

		obj.sum();

	}

}
