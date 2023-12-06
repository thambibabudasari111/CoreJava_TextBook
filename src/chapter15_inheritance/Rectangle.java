package chapter15_inheritance;

public class Rectangle extends Square{
	
	
	//private var
	private double b;
	
	//call square's constructor and send x value
	Rectangle(double x, double y)
	{
		super(x);
		b=y;
	}
	
	void area()
	{
		//because of inheritance,'l' of square class is available
		System.out.println("Area of rectangle: "+(l*b));
	}

	public static void main(String[] args) {

		//display are of rectangle
		Square s = new Square(5.5);
		s.area();
		
		Rectangle r = new Rectangle(5.5, 6);
		r.area();
	}

}
