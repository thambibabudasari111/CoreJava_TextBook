package chapter_12_classes_and_objects;

public class Demo {

	public static void main(String[] args) {

		// create Person object:
		CreateClassAndObject obj = new CreateClassAndObject();

		// find the hash code of object
		System.out.println("Hash code= " + obj.hashCode());
		
		//initializing the instance variables using the reference
		
		obj.talk();
		
		CreateClassAndObject obj1 = new CreateClassAndObject();
		obj1.talk();
	}
}
