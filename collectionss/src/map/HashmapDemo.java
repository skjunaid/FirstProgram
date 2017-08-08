package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapDemo {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("junaid", 100);
		hm.put("ahmed", 200);
		hm.put("java", 300);
		hm.put("j2ee", 400);
		System.out.println(hm);
		System.out.println(hm.put("junaid", 1000));
		Set s = hm.keySet();
		System.out.println(s);
		Collection c = hm.values();
		System.out.println(c);
		Set s1 = hm.entrySet();
		System.out.println(s1);
		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey() + "....." + m1.getValue());
			if (m1.getKey().equals("java")) {
				m1.setValue(500);

			}
		}
System.out.println(hm);
	}

}
