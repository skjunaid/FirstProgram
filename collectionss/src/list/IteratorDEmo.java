package list;

import java.util.ArrayList;

import java.util.Iterator;



public class IteratorDEmo {
	public static void main(String[] args) {
		ArrayList l= new ArrayList();
		for(int i=0;i<=10;i++){
			l.add(i);
			
		}
		System.out.println(l);
	     Iterator t= l.iterator();
	     while (t.hasNext()){
	    	 Integer i=(Integer)t.next();
	    	 if(i%2==0){
	    		 System.out.println(i);
	    	 }
	    	 else{
	    		 t.remove();
	    	 }
	     }
		System.out.println(l);
	}

}
