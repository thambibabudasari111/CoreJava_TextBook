package chapter14_relationship_between_objects;


/*
 *It is possible to create objects for different classes and establish
 *relationship between them. 
 *Three ways to relate objects in Java
 *1. Using references
 *2. Using inner class concept
 *3. Using inheritance
 *
 * We want to access the members of class Two, in class One, we should 
 * relate their objects
 * For this, just declare the reference variable of class Two as an instance
 * variable in class One.
 * 
 * The reference variable can be used to refer all members of class Two from class One.
 * 
 */
public class RelatingObjectsUsingReferences1 {

	int x; //instance variable
	RelatingObjectsUsingReferences2 t; //class RelatingObjectsUsingReferences2 reference
	
	RelatingObjectsUsingReferences1(RelatingObjectsUsingReferences2 t)
	{
		//copy RelatingObjectsUsingReferences2 reference into t
		this.t=t; 
		x=10;
	}
	
	//method to display class RelatingObjectsUsingReferences1 and RelatingObjectsUsingReferences2 vars
	void display()
	{
		System.out.println("RelatingObjectsUsingReferences1 x= "+x);
		//call RelatingObjectsUsingReferences2 method
		t.display();
		
		//access class RelatingObjectsUsingReferences2 variables
		System.out.println("RelatingObjectsUsingReferences2 var= "+t.y);
	}
	
	
	public static void main(String[] args) {

		//create class RelatingObjectsUsingReferences2 object and store 22
		RelatingObjectsUsingReferences2 obj2 = new RelatingObjectsUsingReferences2(22);
		
		
		//create class RelatingObjectsUsingReferences1 object and pass RelatingObjectsUsingReferences2 object to it
		RelatingObjectsUsingReferences1 obj1 = new RelatingObjectsUsingReferences1(obj2);
		//call RelatingObjectsUsingReferences1 method
		obj1.display();
	}

}
