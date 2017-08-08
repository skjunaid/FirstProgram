
public class Test {
	public static void main(String[] args) {
		long num=35869;
		long rev=0;
		long rem=0;
		while(num>0){
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
			
		}
		System.out.println(rev);
		
	}

}
