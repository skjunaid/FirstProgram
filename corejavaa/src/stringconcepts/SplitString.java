package stringconcepts;

public class SplitString {
	public static void main(String[] args) {
		String s="HELLO-IT-IS-SPLIT-METHOD";
				
		String p[]=s.split("-");
		for(int i=0;i<p.length;i++){
		System.out.println(p[i]);}
	}

}
