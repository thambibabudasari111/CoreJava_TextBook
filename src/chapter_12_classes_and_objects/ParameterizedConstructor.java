package chapter_12_classes_and_objects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParameterizedConstructor {

	//To accept person's name and age and display if he is young, middle aged or old
	
	//instance variables
	private String name;
	private int age;
	
	ParameterizedConstructor(String s, int i)
	{
		name = s;
		age = i;
	}
	
	//to check the age and display he is young, middle aged or old
	public void check()
	{
		if(age<=30)
			System.out.println(name+ " is young");
		else if(age<=50)
			System.out.println(name+" is middle aged");
		else 
			System.out.println(name+" is old");
	}
	
	public static void main(String[] args) throws IOException{

		//create BufferedReader object
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//accept name and age from command line arguments
		//name and age are stored in arg[0] and args[0] as strings
		String s = args[0];
		int i = Integer.parseInt(args[1]);
		
		//create a class object and pass name and age to the constructor
		ParameterizedConstructor obj = new ParameterizedConstructor(s,i);
		
		//check the age
		obj.check();
	}

}
