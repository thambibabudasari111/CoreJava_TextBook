package chapter_11_oops_concepts;

public class Encapsulation {

	/*
	 * Encapsulation is a mechanism where the data (Variables) and the code (methods) act on the data will bind together.
	 * if we take a class, we write the variables and methods inside the class. Thus, class is binding them together. So, class is an example
	 * for encapsulation.
	 * 
	 * The variables and methods of a class are called 'members' of a class. Generally, the variables in the class are declared by using a keyword
	 * 'private'. This means the variables are not directly available to any other class. 
	 * 
	 *  The methods of a class are declared as 'public' this means the methods can be called and user from any where outside of the class.\
	 *  Encapsulation protects the inner implementation of the members of the class from outside environment.
	 */
	class Employee {

		int id = 1001;
		String name = "Vishal";

		void displayDetail() {
			System.out.println("Id= " + id);
			System.out.println("Name= " + name);
		}
	}
		public class Student {
			
			int id=12;
			String name="manikanta";
			
			
			void displayDetails()
			{
				System.out.println("Id= "+id);
				System.out.println("Name= "+name);
			}
		}
	
	public static void main(String[] args) {
		Encapsulation enc=new Encapsulation();
		Employee e = enc.new Employee();
		e.displayDetail();
		
		Student s = enc.new Student();
		s.displayDetails();
		
	}

}
