import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapPutExample {
	public static void main(String[] args) throws InterruptedException {

		// declare the hashmap
		HashMap<String, String> mapStudent = new HashMap<>();
		boolean loopAgain = true;
		Scanner scan = new Scanner(System.in);

		// loop while user not entering no
		do {
			// ask for user input for date
			System.out.print("Enter dob:");
		    String dob = scan.nextLine();

			// ask for user input which corresponds to student name
			System.out.print("Enter Name:");
			String name = scan.nextLine();

			// add the key value pair from user input to the hashmap

			String oldVal = mapStudent.put(dob, name);

			if (oldVal!=null) {
				System.out.println("Student Id Number:" + dob + " is "
						+ oldVal + " and has been overwritten by " + name);
			}

			// ask user to check if another entry is required
			System.out.print("Enter another student (y/n)?");
			String answer = scan.nextLine();

			// condition to satisfy in order to loop again
			if (answer.equals("y") || answer.equals("Y")) {
				continue;
			} else {
				break;
			}

		} while (loopAgain);
		scan.close();

		System.out.println("\n**********************************");
		System.out.println("The following students are in database");
		System.out.println("   ID Number  "+ "      Name");		
		for(String dob:mapStudent.keySet()){
			System.out.println("   "+dob+"     "+mapStudent.get(dob));
		}
		System.out.println("\n**********************************");
	}

}
