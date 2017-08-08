package map;

import java.util.Comparator;

public class MyComparator implements Comparator {
	public int compare(Object o,Object oo){
		String s1= o.toString();
		String s2= oo.toString();
		return s2.compareTo(s1);
		
	}


}
