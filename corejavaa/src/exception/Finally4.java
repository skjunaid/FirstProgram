package exception;

public class Finally4 {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 0;
		int n3 = 0;
		try {
			// exceptional code
			System.out.println("got exceptinon");
			n3 = n1 / n2;
		}
		// SUB TO SUPER
		catch (ArithmeticException | NullPointerException e) {
			System.out.println("handling exception");

			System.out.println("1st catch block");
			n3 = n1 / 5;
			System.out.println("value of n3 =" + n3);

		} catch (RuntimeException e2) {
			System.out.println("handling exception");

			System.out.println("2nd catch block");

		}

		catch (Exception e1) {
			System.out.println("handling exception");

			System.out.println("3rd catch block");

		}

		finally {
			n3 = n1 / 2;

		}
		System.out.println("value of n3 in finally block=" + n3);

	}

}
