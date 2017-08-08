package interview;

public class ForLoop {
	public static void main(String[] args) {
		int sum=0;
		for (int i=1;i<=10;i++){
			sum=sum+i;
	}
		System.out.println("sum of 1to10="+sum);
		
		int esum=0;
		int osum=0;
		for(int i=1;i<=20;i++){
			if(i%2==0){
				esum=esum+i;	
			}
			else{
				osum= osum+i;
			}
		}
		System.out.println("even sum 1 to 20="+esum);
		System.out.println("odd sum1 to 20="+osum);
	}
    
}
