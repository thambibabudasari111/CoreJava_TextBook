package chapter14_relationship_between_objects;

public class One {
	
	//obj2 is class Two's reference
	Two obj2;
	
	//initialize obj2
	One(Two obj2)
	{
		this.obj2=obj2;
	}
	
	double cube(double x)
	{
		//call class Two's method using obj2
		double result = x*obj2.square(x);
		
		//return result 
		return result;
	}

	public static void main(String[] args) {

		//create class Three object
		Three obj3 = new Three();
		
		//create class Two object obj2 and pass obj3
		Two obj2 = new Two(obj3);
		
		//create class One object obj1 and pass obj2
		One obj1 = new One(obj2);
		
		//call cube method of class One
		double result1 = obj1.cube(5);
		System.out.println("Cube of 5= "+result1);
		
		//call square() method of class Two
		double result2 = obj2.square(6);
		System.out.println("Square of 6= "+result2);
		
		
	}

}
