package chapter_13_methods_in_java;

public class PassPrimitiveDataTypesToMethods {

	/*
	 * Primitive data types or fundamental data types represent single entities or single values. 
	 * For example, char, int, byte, short, long, float, double, and boolean are called primitive data types. 
	 * They passed to members by value. This means when we pass primitive data types to methods, a copy of those will be passed to methods.
	 * Therefore, any changes made to them inside the method will not be affect them outside the method
	 * This is also called 'pass by value' or 'call by value'
	 */
	
	//primitive data types are passed to methods by value
	//to interchange num1 and num2
	void swap(int num1, int num2)
	{
		int temp = num1; //take a temporary variable
		num1 = num2;
		num2 = num1;
	}
	
	public static void main(String[] args) {

		//take two primitive data types
		int num1 = 10, num2 = 20;
		
		//create object
		PassPrimitiveDataTypesToMethods obj = new PassPrimitiveDataTypesToMethods();
		
		//display data before calling
		System.out.println(num1+"\t"+num2);
		
		//call swap and pass primitive data types
		obj.swap(num1, num2);
		System.out.println(num1+"\t"+num2);
 	}

}
