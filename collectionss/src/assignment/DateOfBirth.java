package assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class DateOfBirth {
	public static void main(String[] args) throws Exception, IOException {
		System.out.println("enter Number of students");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TreeMap<String, String> t = new TreeMap<String, String>();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			System.out.println("enter name");
			String name = br.readLine();
			System.out.println("enter dob");
			String date = br.readLine();
			t.put(date,name);
		}
		Set<String> keys = t.keySet();
		for (String key : keys) {
			System.out.println("DOB IS:  "+key + "     NAME:  "+t.get(key));
			System.out.println();
		}
		
	}
}
