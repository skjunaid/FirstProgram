package stringconcepts;

import java.util.Scanner;

public class ReverseNOtoReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");

		String s = sc.nextLine();

		System.out.println("given string=" + s);

		for (int i = s.length() - 1; i >= 0; i--) {
			char s1 = s.charAt(i);

			System.out.print(s1 + "  ");

		}

	}

}
