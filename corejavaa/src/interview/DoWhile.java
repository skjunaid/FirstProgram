package interview;

public class DoWhile {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.println("i value =" + i);
			i++;
		}
		System.out.println("after loop i value =" + i);
		do {
			i--;
			System.out.println("i value=" + i);
		} while (i > 1);

	}

}
