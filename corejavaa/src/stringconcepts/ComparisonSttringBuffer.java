package stringconcepts;

public class ComparisonSttringBuffer {
	public static void main(String[] args) {
		
	
	StringBuffer sb= new StringBuffer("junaid");
	StringBuffer sb1= new StringBuffer("junaid");
	
	System.out.println(sb==sb1);

	System.out.println(sb.equals(sb1));
	System.out.println(sb1.capacity());
	StringBuffer sb2=new StringBuffer();
	System.out.println(sb2.capacity());
	System.out.println(sb1.length());
	System.out.println(sb1.charAt(0));
    sb1.setCharAt(1,'a');
    System.out.println(sb1);
    sb.insert(0, "abc");
    System.out.println(sb);
    sb.delete(0,3);
    System.out.println(sb);
    sb.reverse();
    System.out.println(sb);
    
    
}
}