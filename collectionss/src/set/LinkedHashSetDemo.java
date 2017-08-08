package set;


import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet h= new LinkedHashSet();
		h.add("a");
		h.add("b");
		h.add("c");
		h.add("d");
		h.add(null);
		h.add(10);
		System.out.println(h.add("a"));
		System.out.println(h);

		}
		}



