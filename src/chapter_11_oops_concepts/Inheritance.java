package chapter_11_oops_concepts;

public class Inheritance {

	class A
	{
		protected int a;
		protected int b;
		
		public void method1()
		{
			System.out.println("method 1");
		}
	}
	
	class B extends A
	{
		private int c;
		public void method2()
		{
			System.out.println("method 2");
		}
	}
	
	public static void main(String[] args) {
		
		Inheritance in = new Inheritance();
		B obj = in.new B();
		obj.a=10;
		obj.b=20;
		obj.c=30;
		obj.method1();
		obj.method2();
		
	}

}
