package interview;

public class PalindromeWhile {
	public static void main(String[] args) {
		int num = 121;
		int rem = 0;
		int temp = num;
		int rev = 0;
		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}
		System.out.println("reverse number=" + rev);
		if (temp == rev) {
			System.out.println("palindrome");

		} else {
			System.out.println("not a palindrome");
		}

	}

}
