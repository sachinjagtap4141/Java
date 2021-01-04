package HundreadJavaProgram;

import java.util.Scanner;

public class DuplicateLargestNumber {

	
	public static void main(String[] args) {
		
		
		int x,y,z;
		
		System.out.println("Enter three integer");
		Scanner s = new Scanner(System.in);
		
		x=s.nextInt();
		y=s.nextInt();		
		z=s.nextInt();
		

		if(x>y && x>z) {
			System.out.println("Bigest number is: "+x);
			System.out.println("firstNumber");
		}else if(y>x && y>z) {
			System.out.println("Bigest number is: "+y);
			System.out.println("secondNumber");
		}else if(z>x && z>y) {
			System.out.println("Bigest number is: "+z);
			System.out.println("thirdNumber");
		}else {
			System.out.println("Entered number are not distinct");
		}
		
		
		
		
		
	}
	
	
	
	
	
	
}
