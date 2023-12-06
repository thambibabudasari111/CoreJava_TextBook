package chapter15_inheritance;

public class Student extends Teacher{

	//instance variables
	int marks;
	
	//setter method to store marks
	void setMarks(int marks)
	{
		this.marks=marks;
	}
	
	//getter method to retrieve marks
	int getMarks()
	{
		return marks;
	}
	
	
	
	public static void main(String[] args) {

		//create object to Student class
		Student s = new Student();
		
		//set the values for setter methods of Teacher class and Student class
		s.setId(1001);
		s.setName("thambi babu");
		s.setAddress("Hyderabad");
		s.setSal(45000.53343f);
		s.setMarks(546);
		
		//use getter methods to retrieve details and display on console
		System.out.println("Id= "+s.getId());
		System.out.println("Name= "+s.getName());
		System.out.println("Address= "+s.getAddress());
		System.out.println("Sal= "+s.getSal());
		System.out.println("Marks= "+s.getMarks());
		
		
	}

}
