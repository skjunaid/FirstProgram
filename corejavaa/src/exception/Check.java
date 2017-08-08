package exception;

public class Check {
	private static void verify(int worktime) throws WorkHard {
		if (worktime > 10) {
			throw new WorkHard();

		}

		else {
			System.out.println("DO WORK SOME MORE TIME");
		}

	}

	private static void verify1(int worktime) throws WorkHard, CloneNotSupportedException {
		verify(worktime);
		throw new CloneNotSupportedException();

	}

	public static void main(String[] args) throws CloneNotSupportedException {
		int worktime = 11;
		try {
			verify(worktime);
		} catch (WorkHard wh) {
			wh.learn();
		}
	}
}
