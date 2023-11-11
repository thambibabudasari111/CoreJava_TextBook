package chapter_12_classes_and_objects;

public class Constructors_Call_MainMethod {

	public static void main(String[] args) {

		//create Constructor class object const
		Constructors cons = new Constructors();
		
		//call the talk() method
		cons.talk();
		
		//create another object cons1
		Constructors cons1= new Constructors("Babu", 31);
		
		cons1.talk();
	}

}
