package stringconcepts;

import java.util.Scanner;

public class Rev1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");

		String s = sc.nextLine();
		String s2 = "";
		System.out.println("given string=" + s);

		char[] c = s.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {
			s2 = s2 + c[i];

		}
		System.out.print("reverse  string format is:" + s2);
	}
}
