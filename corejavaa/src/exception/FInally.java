package exception;

public class FInally {
	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 0;
		int n3 = 0;
		try {
			// exceptional code
			System.out.println("got exceptinon");
			n3 = n1 / n2;
		} catch (Exception e) {
			System.out.println("handling exception");
			// handlilng
			n3 = n1 / 1;
			System.out.println("n3 value in catch block=" + n3);

		}
		finally{
			n3 = n1/2;
			
		}

		System.out.println("n1 value=" + n1);
		System.out.println("n2 value=" + n2);
		System.out.println("n3 value in finaly block=" + n3);
		
	}

}
