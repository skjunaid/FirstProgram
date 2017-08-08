package polymorphism;

public class MethodOverLoading {
	//automatic promotion
			public void m1(int i)
			{
				System.out.println("auto integer");
			
			}
			public void m1(float f){
				System.out.println("auto float");
			}
			public static void main(String[] args) {
			
				MethodOverLoading  ml=new MethodOverLoading ();
				ml.m1(10);
				ml.m1(10.5f);
				ml.m1(10l);//promotion possible 
				//ml.m1(10.5); promotion is not possible 
;			}
}
