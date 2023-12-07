package chapter16_polymorphism;

public class PolymorphismWithMethods {

	/*
	 * The ability to exist in different forms is called 'polymorphism'.
	 * 
	 * In Java, a variable, a object or a method can exist in different forms, thus performing various tasks depending on the context. 
	 * Because same variable or method can perform different tasks.
	 * 
	 * When using variables, sometimes inherently the data type of the result is decided by the compiler and accordingly execution proceeds.
	 * 
	 * Coercion: Coercion is the automatic conversion between different data types done by the compiler
	 * 
	 * Conversion: Conversion is an explicit change in the data type specified by the cast operator.
	 * 
	 */
	public static void main(String[] args) {

		int a=10, b=20;
		
		//coercion: automatic conversion by compiler. the output will displayed as int data type
		System.out.println(a+b);
		
		//conversion: using cast operator converting float data type to int type
		float c = 5.5f;
		int x = (int)c; //using cast operator 
		
		System.out.println(x);
	}

}
