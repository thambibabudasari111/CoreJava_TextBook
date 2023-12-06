package chapter15_inheritance;

public class Square extends Shape{

	//Square is super class of Rectangle
	Square(double l)
	{
		super(l); //call Shape's constructor and send l value
	}
	
	//calculate are of square
	void area()
	{
		//because of inheritance, 'l' of shape class is available
		System.out.println("Area of square: "+(l*l));
	}
}
