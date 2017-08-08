package interview;

public class Deviding {
	public static void main(String[] args) {
		int a =333111222;
	
		int sum=0;
		int c=0;
		while(a>0)
		{
			c=a%10;
			sum=sum+c;
			a=a/10;
		}
		System.out.println("sum=" + sum);
		
		
}	

}
