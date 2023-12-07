package chapter16_polymorphism;

public class StaticPolymorphism1 extends StaticPolymorphism{

	//method to calculate square root value
	static void calculate(double x)
	{
		System.out.println("Square root value= "+Math.sqrt(x));
	}
	
	public static void main(String[] args) {

		//super class reference to sub class object
		StaticPolymorphism obj = new StaticPolymorphism1();
		
		//call calculate() method using super class reference
		obj.calculate(10);
		
		StaticPolymorphism1 obj1 = new StaticPolymorphism1();
		obj1.calculate(20);
	}

}
