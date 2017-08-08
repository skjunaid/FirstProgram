package stringconcepts;

import java.util.Scanner;

public class SubStringlongest {
	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("entered sstring:" + sc);
		String s1="" ;
		char[] ch = s.toCharArray();
		System.out.println(ch.length);
		for (int i = 0; i < ch.length - 1; i++) {
			for (int j = 1; j <=ch.length-1; j++) {
				if (ch[i] != s.charAt(j) && ch[i] !=s.charAt(j-2)) {
					s1 = s1+ch[i];
				}
			/*if(ch[i] != ch[i+1]&&ch[i] != ch[i-1]){
				s1 = s1+ch[i];
				}*/
				
			}

		
		}
		System.out.println(s1);
			
	}
}