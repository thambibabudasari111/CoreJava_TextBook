package chapter_13_methods_in_java;

public class AccessorAndMutatorMethods {

	// instance variables
	private String name;
	private int age;

	// mutator methods to store data
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// accessor methods to read data
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {

		// create an empty AccessorAndMutatorMethods class object
		AccessorAndMutatorMethods obj = new AccessorAndMutatorMethods();

		// store some data into the object
		obj.setName("Thambi");
		obj.setAge(33);

		// access data from object
		System.out.println("Name= " + obj.getName());
		System.out.println("Age= " + obj.getAge());

	}

}
