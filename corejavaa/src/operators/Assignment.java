package operators;

public class Assignment {
public static void main(String[] args) {
	//noramal assignment
	int x= 10;
	//compound assignment
	x+=2;
	System.out.println(x);
	x-=2;
	System.out.println(x);
	x*=2;
	System.out.println(x);
	x/=2;
	System.out.println(x);
	x%=2;
	System.out.println(x);
	
	
	
	//chained assignment
	// not possible as int a=b=c=d=20;
	
	int a,b,c,d;
	a=b=c=d=20;
	System.out.println(a+"...."+b+"..."+c+"...."+d);
long z=3;
	
	z&=2;
	System.out.println(z);
	z|=2;
	System.out.println(z);
	z^=2;
	System.out.println(z);
	
	
	
	
		
	}

}
