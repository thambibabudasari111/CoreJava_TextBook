package chapter_13_methods_in_java;

public class WithParametersAndReturnType {

	// method to calculate sum of num1, num2
	double sum(double num1, double num2) {
		double result = num1 + num2;
		return result;
	}

	public static void main(String[] args) {

		WithParametersAndReturnType obj = new WithParametersAndReturnType();
		double result = obj.sum(10.223, 11.4324);
		System.out.println(result);

	}

}
