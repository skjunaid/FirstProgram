package list;

import java.util.LinkedList;

public class LInkedLIstDemo {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("junaid");
		l.add(null);
		l.add(10);
		l.add("junaid");
		System.out.println(l);
		l.set(0, "ahmed");
		System.out.println(l);
		l.set(0, "java");
		System.out.println(l);
		l.removeLast();
		l.addFirst(100);
		System.out.println(l);
	}

}
