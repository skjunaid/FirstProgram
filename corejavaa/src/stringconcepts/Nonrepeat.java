package stringconcepts;

import java.util.Scanner;

public class Nonrepeat {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter a string");
		String s1 = s.nextLine();
	char [] ch =s1.toCharArray();
		int count=0;
		int start=0;
		int end=0;
	for(int i=1;i<s1.length()-1;i++)
	{
		if(ch[i]==ch[i-1])
		{
		if(count==0)
		{
			start=i+1;
			count++;
		}
		else if(count==1)
		{
			end=i-1;
		}
		}
	}
	
	String s2=s1.substring(start,end);
	
	
		System.out.println("longest substring:    "+s2);
	}

}
