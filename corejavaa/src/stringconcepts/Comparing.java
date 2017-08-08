package stringconcepts;

public class Comparing {
	public static void main(String[] args) {
		String s = new String("junaid");
		String s1 = new String("junaid");
	
		System.out.println(s==s1);

		System.out.println(s.equals(s1));
		System.out.println(s.compareTo(s1));//based on ascci if=0;
		System.out.println(s.compareToIgnoreCase(s1));//content = 0
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s.charAt(1));
		String s2= "AHMED";
		s2=s2.concat("junaid");
		System.out.println(s2);
		String s3= "junaid";
		s3+="ahmed";
		System.out.println(s3);
		System.out.println(s3.substring(1));
		System.out.println(s3.substring(1,6));
		System.out.println(s3.length());
		
		System.out.println(s3.toLowerCase());
		System.out.println(s3.toUpperCase());
		System.out.println(s3.indexOf('a'));
		System.out.println(s3.lastIndexOf('a'));
		System.out.println(s3.startsWith("ju"));
		System.out.println(s2.endsWith("id"));
		String s4=s3.replace('j','h');
		System.out.println(s4);
		System.out.println(s4.trim());
		
		
	}
}
