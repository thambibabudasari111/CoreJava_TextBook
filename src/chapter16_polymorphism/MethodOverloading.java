package chapter16_polymorphism;

public class MethodOverloading {

	//method to add two values
	void add(int a, int b)
	{
		System.out.println("Sum of two= "+(a+b));
	}
	
	//method to add three values
	void add(int a, int b, int c)
	{
		System.out.println("Sum of three: "+(a+b+c));
	}
	public static void main(String[] args) {

		//create object
		MethodOverloading obj = new MethodOverloading();
		obj.add(10, 20);
		obj.add(10, 20, 30);
	}

}
