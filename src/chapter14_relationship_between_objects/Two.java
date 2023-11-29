package chapter14_relationship_between_objects;

public class Two {

	//obj3 is class Three reference
	Three obj3;
	
	//initialize obj3
	Two(Three obj3)
	{
		this.obj3=obj3;
	}
	
	double square(double x) 
	{
		//call class Three method using obj3
		double result = x*obj3.get(x);
		//return result to class One
		return result;
	}
}
