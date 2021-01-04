package Rough2;

public class BreakWithFor {

	public static void main(String[] args) {

		for(int i=0;i<=10;i++){
			for(int j=0;j<=10;j++){
				System.out.println(j);
//				break;
			}
			if(i==5){
			System.out.println("outer loop start"+i);
			break;
			}
			
		}
		
		
		
		
	}

}
