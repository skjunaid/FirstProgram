package list;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;

public class Assignment {
	public static void main(String[] args)throws Exception {
		System.out.println("enter Number of students");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int  n = Integer.parseInt(br.readLine());
	    
	    ArrayList<String> l=new ArrayList<String>();
	    System.out.println("enter student names");
	   for(int i=1;i<=n;i++){
		   System.out.println(i);
		   String s=br.readLine();
		   l.add(s);
		   System.out.println("added");
	   }
	   
	   Collections.sort(l);
	   
	   Iterator ii=l.iterator();

	while(ii.hasNext())
	{
	System.out.println(ii.next());
	}
		
	}

}
