package HundreadJavaProgram;

import java.math.BigInteger;
import java.util.Scanner;

public class DuplicateSwap {


	public static void main(String[] args) {
		String x,y;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first large Numbers");

		x = s.nextLine();
		System.out.println("Enter second large Numbers");
		y = s.nextLine();
		
		BigInteger first = new BigInteger(x);
		BigInteger second = new BigInteger(y);
		
		BigInteger ans;
//		
//		ans = first.add(second);
//		System.out.println(sum);
//		
//		ans = first.divide(second);
		
//		ans = first.subtract(second);
		
		ans = first.multiply(second);
		
		
		
		
		System.out.println("value of two large integer is: "+ans);
		
		
		
		
		
	}
	

	
	
	
}
