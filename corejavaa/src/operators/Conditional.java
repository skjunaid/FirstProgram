package operators;

public class Conditional {

	public static void main(String[] args) {
		int age=25;
		float height=5.10f;
		String s,t;
		s=(age==25)?"eligibeforarmy":"eligibleforpolice";
		t=(age==25)?"eligibeforarmy":((height>=5))?"eligibleforpolice":"noteligible";
		System.out.println(s);
		int x=10;
		 x=(x>20)?30:40;
		 System.out.println(x);	

	}

}
