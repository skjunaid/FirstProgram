package assignment;

import java.util.Scanner;

public class Alphabetical_Order {
	public static void main(String[] args) 
    {
        int n;
        String dum;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of names:");
        n = s.nextInt();
        String names[] = new String[n];
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter all names:");
        for(int i = 0; i < n; i++)
        {
            names[i] = s1.nextLine();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (names[i].compareTo(names[j])>0) 
                {
                    dum = names[i];
                    names[i] = names[j];
                    names[j] = dum;
                }
            }
        }
        System.out.print("Names in Sorted Order:" + "\n");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(names[i] + "\n");
        }
       System.out.print(names[n - 1]);
    }
}

