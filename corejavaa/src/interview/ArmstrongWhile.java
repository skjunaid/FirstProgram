package interview;

public class ArmstrongWhile {
	public static void main(String[] args) {
		int num = 111, temp = num, rem = 0, sum = 0;
		while (num > 0) {
			num = num % 10;
			sum = sum + rem * rem * rem;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("given number is ARMSTRONG");
		} else {
			System.out.println("not ARMSTRONG");
		}
	}

}
