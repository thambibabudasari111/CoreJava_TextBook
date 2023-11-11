package chapter_13_methods_in_java;

public class WithoutParametersAndWithReturnType {

	// instance variables
	double num1, num2;

	// parameterized constructor
	WithoutParametersAndWithReturnType(double x, double y) {
		num1 = x;
		num2 = y;
	}

	// method to calculate sum of num1, num2
	// this method doesn't accept any values but returns the result
	double sum() {
		double res = num1 + num2;
		return res;
	}

	public static void main(String[] args) {

		WithoutParametersAndWithReturnType obj = new WithoutParametersAndWithReturnType(10.42, 42.2323);

		double result = obj.sum();
		System.out.println("Sum = " + result);
	}

}
