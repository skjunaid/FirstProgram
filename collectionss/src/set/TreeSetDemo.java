package set;

import java.util.TreeSet;

public class TreeSetDemo {
public static void main(String[] args) {
	TreeSet t= new TreeSet();
	t.add("a");
	t.add("a");
	t.add("b");
	t.add("z");
	t.add("d");
	//t.add(10);
	//t.add(null);
	System.out.println(t);
}
}
