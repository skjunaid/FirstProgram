package interview;

public class WhileReverseNumber {
	public static void main(String[] args) {

		int num = 1234;
		int rem = 0;
		while (num > 0) {
			rem = num % 10;
			System.out.print(rem);
			num = num / 10;

		}

	}
}