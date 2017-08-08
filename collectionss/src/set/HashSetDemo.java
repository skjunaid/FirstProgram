package set;

import java.util.HashSet;

public class HashSetDemo {
public static void main(String[] args) {
HashSet h= new HashSet();
h.add("b");
h.add("c");

h.add("d");
h.add(null);
h.add(10);
System.out.println(h.add("d"));
System.out.println(h);

}
}
