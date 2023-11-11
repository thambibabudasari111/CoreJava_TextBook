package polymorphism;

public class MethodOverloading {

	//method to add two values
	void add(int a, int b)
	{
		System.out.println("sum of two= "+ (a+b));
	}
	
	//method to add three values
	void add(int a, int b, int c)
	{
		System.out.println("sum of three= "+ (a+b+c));
	}
	
	
	public static void main(String[] args) {

		
		//create a class object
		MethodOverloading mo = new MethodOverloading();
		
		//call add() and pass two values
		mo.add(10, 20);
		
		//call add() and pass three values
		mo.add(10, 20, 30);
	}

}
