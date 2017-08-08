package polymorphism;

public class Test {
	
		public void  m1()
		{
			System.out.println("0 arguments");
		
		}
		
		public void  m1(int x)
		{
			System.out.println("integer arguments");
		}
		public void  m1(double x)
		{
			System.out.println("integer arguments");
		}
	
		
		public static void main(String[] args)
		{
		Test t= new Test();
		t.m1();
		t.m1(5);
		t.m1(5.5);
		}
	}


