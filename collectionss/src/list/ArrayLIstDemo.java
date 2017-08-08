package list;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.concurrent.Callable;

public class ArrayLIstDemo {
	public static void main(String[] args) {

		ArrayList l = new ArrayList();
		l.add("a");
		l.add(10);
		l.add("a");
		l.add(null);
		System.out.println(l.get(1));
		System.out.println(l.indexOf("a"));
		System.out.println(l.lastIndexOf("a"));
		System.out.println(l);
		l.add(2, "m");
		l.add("n");
		System.out.println(l);
		l.remove(4);
		l.set(4, "j");
		System.out.println(l);

		System.out.println(l instanceof Serializable);
		System.out.println(l instanceof Cloneable);
		System.out.println(l instanceof RandomAccess);

	}

}
