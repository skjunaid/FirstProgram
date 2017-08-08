package operators;

public class Relational {
	public static void main(String[] args) {
		int age = 25;
		float height = 5.10f;
		if (age >= 25 && height >= 6) {
			System.out.println("eligible for army ");

		} else if (age == 25 || height >= 9) {
			System.out.println("eligible for police ");

		} else if (!(age == 25)) {

			System.out.println("NOT ELIGIBLE");

		}
	}
}
