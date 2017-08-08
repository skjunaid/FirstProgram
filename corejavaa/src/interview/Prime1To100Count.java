package interview;

public class Prime1To100Count {

	public static void main(String[] args) {
		int count = 0;
		for (int j = 10; j <= 100; j++) {
			int num = j;

			boolean res = true;

			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					res = false;
					break;
				}
			}
			if (res == true) {
				System.out.println(j);
				count++;

			}
		}
		System.out.println("number count" + count);
	}
}