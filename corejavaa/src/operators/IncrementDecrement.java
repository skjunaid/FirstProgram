package operators;

public class IncrementDecrement {
	public static void main(String[] args) {
		int x=10;
		System.out.println("initially X value="+x);
		
		
		int y=x++;//x=10
		
		System.out.println(" Y value="+y);
		System.out.println("finally X value="+x);
		
		
		y=++x;//x=12
		System.out.println("initially X value="+x);
		System.out.println(" Y value="+y);
		System.out.println("finally X value="+x);
		
		
		y=x--;//x=12
		System.out.println("initially X value="+x);
		System.out.println(" Y value="+y);
		System.out.println("finally X value="+x);
		
		
		y=--x;//x=11
		System.out.println("initially X value="+x);
		System.out.println(" Y value="+y);
		System.out.println("finally X value="+x);
		
		
		

	}

}
