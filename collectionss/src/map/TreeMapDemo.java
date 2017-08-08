package map;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap tm= new TreeMap();
		tm.put("yyy",10);
		tm.put("zzz",20);
		tm.put("zzz",20);
		
		tm.put("mmm","www");
		//dnso so only homogeneous keys are alowed     tm.put(220,210);
		
		tm.put("zzz",null);
		//tm.put(null,20);
		System.out.println(tm);
		
	}

}
