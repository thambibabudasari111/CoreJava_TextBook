package chapter_13_methods_in_java;

public class StaticMethodWithDataAndReturnType {

	//static method should be declared as static
	static double sum(double num1, double num2)
	{
		double res = num1+num2;
		return res; 
	}
	
	public static void main(String[] args) {

		//static method using Classname.methodname();
		double result = StaticMethodWithDataAndReturnType.sum(11.342, 12.4242);
		System.out.println("Sum = "+result);
	}

}
