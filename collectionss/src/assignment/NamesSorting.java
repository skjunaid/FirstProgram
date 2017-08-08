package assignment;

import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class NamesSorting {
	public static void main(String[] args) throws Exception {
		System.out.println("enter Number of students");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> l = new ArrayList<String>();
		int n = Integer.parseInt(br.readLine());
		System.out.println("enter all names");
		for (int i = 0; i < n; i++) {

			String name = br.readLine();
			l.add(name);
		}
		Collections.sort(l);

		Iterator ii = l.iterator();
		while (ii.hasNext()) {
			System.out.println(ii.next());
		}

	}
}