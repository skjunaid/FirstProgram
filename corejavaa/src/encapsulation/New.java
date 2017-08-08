package encapsulation;

public class New {

	public static void main(String[] args) {
		GetterSeter gs = new GetterSeter();
		gs.sety(10);
		gs.setx(20);
		System.out.println("y value="+gs.gety());
		System.out.println("x value="+gs.getx());
		
		
	}

}
