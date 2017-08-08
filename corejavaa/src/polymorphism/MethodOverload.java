package polymorphism;
//child type parent type argument
public class MethodOverload {

	public void m1(String s){
		System.out.println("string version");
	}
	
	public void m1(Object o){
		System.out.println("object version");
	}
	public static void main(String[] args) {
		
		 MethodOverload ml=new  MethodOverload();
		 ml.m1("junaid");
		 ml.m1(null);
		 
	}
}
