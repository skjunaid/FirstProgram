package interview;

public class PimeFor {
	public static void main(String[] args) {
		int num = 23;
		boolean res = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				res = false;
				break;

			}
		}
		if (res == true) {
			System.out.println("number is prime");

		}

		else {
			System.out.println("not a prime");
		}
	}
}
