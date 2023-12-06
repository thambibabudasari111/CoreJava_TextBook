package programs.practice;

public class Test1 {

	Test2 t2;
	
	
	Test1(Test2 t2)
	{
		this.t2=t2;
	}
	
	double square(double x) 
	{
		double result = x*t2.get(x);
		return result;
	}
}
