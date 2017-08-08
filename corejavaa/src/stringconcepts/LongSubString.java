package stringconcepts;

import java.util.Scanner;

public class LongSubString {
	public static void main(String[] args) {
		System.out.println("ener a  string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char ch[]=s.toCharArray();
		String s2 = "";
		System.out.println("given string is:" + s);


		boolean b[] = new boolean[s.length()];
		for (int i = 0; i < s.length(); i++) {
			int count=0;
			if (b[i] == false)
			{
				count=1;
				for (int j = i+1; j < s.length(); j++)
				{
					if (b[j] == false) 
					{
						if(ch[i]==ch[j])
						{
						count++;
						b[j] = true;
						
						}
				}
			}
			}
			
			if(count==1)
			{
				
		         s2=s2+ch[i];
				
			}
		
		
			b[i]=true;

		}
		System.out.println(s2);
	}
}

