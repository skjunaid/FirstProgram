package interview;
import java.util.Scanner;

public class DecimalToBinary {
	
	
	    public static void main(String[] args) 
	    {
	       Scanner s = new Scanner(System.in);
	        System.out.print("Enter any decimal number:");
	        int n = s.nextInt();
	        DecimalToBinary obj = new DecimalToBinary();
	        String x = obj.binary(n);
	        System.out.println("Binary number:"+x);
	    }
	    String binary(int y)
	    {
	        int a;
	        if(y > 0)
	        {
	            a = y % 2;
	            return (binary(y / 2) + "" +a);
	        }
	        return "";
	    }
	
	}


