package exception;

public class Finally5 {
	public static void main(String[] args) {
		

		int n1 = 10;
		int n2 = 0;
		int n3 = 0;
		try {
			// exceptional code
			System.out.println("got exceptinon");
			n3 = n1 / n2;
		} 
		//MULTIPLE IMPLEMENTATIONS IN CATCH BLOCK
		catch (Exception e) {
			System.out.println("handling exception");
			
			n3 = n1 / 1;
			System.out.println("n3 value in 1st implementation=" + n3);
			n3 = n1 /3;
			System.out.println("n3 value in 1st implementation=" + n3);
			n3 = n1 /5;
			System.out.println("n3 value in 1st implementation=" + n3);
		}
	//System.out.println("never possible to write ny catch & finally statement after clssosing a block");
		
		finally{
			n3 = n1/2;
			
		}

		System.out.println("n1 value=" + n1);
		System.out.println("n2 value=" + n2);
		System.out.println("n3 value in finaly block=" + n3);
		
	}


}
