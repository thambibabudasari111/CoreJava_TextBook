package chapter_12_classes_and_objects;

public class Constructors {
	// initializing the instance variables using default constructor

	// instance variables
	private String name;
	private int age;

	//default constructor
	Constructors()
	{
		name = "Thambi";
		age = 33;
	}
	
	//parameterized constructor
	Constructors(String s, int i)
	{
		name = s;
		age = i;
	}
	
	//method
	void talk()
	{
		System.out.println("Hello Iam "+ name);
		System.out.println("My age is "+ age);
	}
	
	

}
