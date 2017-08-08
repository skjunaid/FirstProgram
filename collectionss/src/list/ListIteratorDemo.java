package list;


import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		LinkedList l= new LinkedList();
		l.add("core");
		l.add("junaid");
		l.add("ahmed");
		l.add("java");
		l.add("advanced");
		ListIterator ltr=l.listIterator();
		while(ltr.hasNext()){
			String s = (String) ltr.next();
			if(s.equals("java")){
				ltr.remove();
			}
			else if (s.equals("ahmed")){
				ltr.add("junaid");
			}
			else if (s.equals("core")){
				ltr.set("j2ee");
			}
		}
		System.out.println(l);
	}

}



