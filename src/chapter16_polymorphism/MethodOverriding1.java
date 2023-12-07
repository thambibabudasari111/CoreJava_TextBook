package chapter16_polymorphism;

//sub class
public class MethodOverriding1 extends MethodOverriding{

	//method to calculate square root value                                                                                                                                                                                                                                                                                                                               
	void calculate(double x)
	{
		System.out.println("Square root value= "+Math.sqrt(x));
	}
	
	public static void main(String[] args) {

		//create object to sub class
		MethodOverriding1 obj = new MethodOverriding1();
		
		obj.calculate(20);
		
	}

}
