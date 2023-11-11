package chapter_11_oops_concepts;

public class Polymorphism {
	
	/*
	 * The word 'polymorphism' came from two greek words 'poly' means 'many' and 'morphos' meaning 'forms'. 
	 * Polymorphism represents the ability to assume several different forms. 
	 * In programming we can use a single variable to refer to objects of different types and thus, using that variable we can call the methods of
	 * different objects.
	 * 
	 * Polymorphism provides flexibility in writing programs in such a way that the programmer uses same method call to perform different operations
	 * depending on the requirement.
	 */
	
	class One
	{
		void calculate(int x)
		{
			System.out.println("Square values = "+(x*x));
		}
	}
	
	class Two extends One
	{
		void calculate(int x)
		{
			System.out.println("Cube value = "+(x*x*x));
		}
	}

	public static void main(String[] args) {

		Polymorphism p = new Polymorphism();
		One obj1 = p.new One();
		
		Two obj2 = p.new Two();
		
		One ref;
		
		ref=obj1;
		
		ref.calculate(2);
		
		ref=obj2;
		ref.calculate(2);
		
	}

}
