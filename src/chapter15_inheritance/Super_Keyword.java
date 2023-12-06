package chapter15_inheritance;

public class Super_Keyword {

	//super class variable
	int i=10;
	
	Super_Keyword(int i)
	{
		this.i=i;
	}
	
	void show()
	{
		System.out.println("Super class method: i="+i);
	}
}
