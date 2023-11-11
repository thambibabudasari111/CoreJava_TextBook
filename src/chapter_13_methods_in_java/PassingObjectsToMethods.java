package chapter_13_methods_in_java;

public class PassingObjectsToMethods {

	/*
	 * We can also pass class objects to methods and return objects from the methods.
	 * Even the objects are also passed to methods by value. This means when we send an object to the method, its bit by bit copy will be 
	 * sent to the method. 
	 * Any modifications to the object inside the method will not affect the original copy outside the method.
	 * So when we come out of the method we find original value unchanged.
	 */
	
	//instance variable
	int id;
	
	//to initialize id value
	PassingObjectsToMethods(int id)
	{
		this.id=id;
	}
	
	//to interchange the class objects
	void swap(PassingObjectsToMethods obj1, PassingObjectsToMethods obj2)
	{
		PassingObjectsToMethods temp;
		temp=obj1;
		obj1=obj2;
		obj2=temp;
	}
	
	public static void main(String[] args) {

		//take two PassingObjectsToMethods class objects
		PassingObjectsToMethods obj1 = new PassingObjectsToMethods(10);
		PassingObjectsToMethods obj2 = new PassingObjectsToMethods(20);
		
		//display data before calling
		System.out.println(obj1.id+"\t"+obj2.id);
		
		//call swap and pass PassingObjectsToMethods class objects
		obj1.swap(obj1, obj2);
		
		//display after calling
		System.out.println(obj1.id+"\t"+obj2.id);
	}

}
