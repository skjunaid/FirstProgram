package stringconcepts;

import java.util.Scanner;

public class LongString {
	public static void main(String[] args) {
	System.out.println("ener a  string");
	Scanner sc= new Scanner(System.in);
    String s = sc.nextLine();
   String s2="";
    System.out.println("given string is:"+s);
    char[] j=s.toCharArray();
    for (int i=j.length-1;i>=0;i--)
    {
    	for (int k=j.length-1;k>=0;k--)
    	{
    		
    	
    	
    	if (j[i]!=j[k])
    	{
    		System.out.println(j[i]);
    	}
    	}
    	
	}

}
}