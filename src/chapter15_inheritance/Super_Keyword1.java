package chapter15_inheritance;

public class Super_Keyword1 extends Super_Keyword{

	//sub class variable
	int i=20;
	
	Super_Keyword1(int a, int b)
	{
		//call super class constructor and pass a
		super(a);
		i=b; //initialize sub class var
	}
	
	//sub class method
	void show()
	{
		System.out.println("sub class var: i="+i);
		System.out.println("super class var: i="+super.i);
	}
	
	public static void main(String[] args) {
		
		Super_Keyword1 obj = new Super_Keyword1(11,22);
		obj.show();
		
	}

}
