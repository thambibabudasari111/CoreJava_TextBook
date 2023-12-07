package programs.practice;

public class Test extends Sample{
	
	
	Test1 t1;
	
	Test(Test1 t1)
	{
		this.t1=t1;
	}
	
	double cube(double x)
	{
		double result = x*t1.square(x);
		return result;
	}
	
	
	
	public static void main(String[] args) {

		Test2 obj2 = new Test2();
		
		Test1 obj1 = new Test1(obj2);
		
		Test obj = new Test(obj1);
		
		double result = obj.cube(5);
		System.out.println("cube of 5: "+result);
		
		double result2 = obj1.square(6);
		System.out.println("square of 6: "+result2);
		
	
		
	}

}
