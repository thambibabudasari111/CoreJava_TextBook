package programs.practice;

public class Sample {

	
	private void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	private void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	
	
	public static void main(String[] args) {

		Sample s = new Sample();
		s.add(10, 20);
		s.add(10, 20, 30);
	}

}
