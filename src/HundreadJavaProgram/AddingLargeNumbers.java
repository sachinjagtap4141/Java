package HundreadJavaProgram;

import java.math.BigInteger;
import java.util.Scanner;

public class AddingLargeNumbers {

	public static void main(String[] args) {

		
		  String number1, number2; Scanner in = new Scanner(System.in);
		  System.out.println("Enter first large number"); 
		  number1 = in.nextLine();
		  System.out.println("Enter second large number"); 
		  number2 = in.nextLine();
		  
		  BigInteger first = new BigInteger(number1); 
		  BigInteger second = new BigInteger(number2); 
		  BigInteger sum; sum = first.add(second);
		  System.out.println("Result of addition = \n " + sum);
		  
		 

		/*
		 * byte=8bit 2^7 = range -128 to +127 1 bit for positive or negative values
		 * totle 7+1 =8
		 * 
		 * short=2 byte 2^15 = - 32768 to +32767
		 * 
		 * 
		 * int = 4 byte
		 * 
		 * 2^31= 2147783648
		 * 
		 * long = 8 byte 2^63 = -9223372036854775808 to +9223372036854775808
		 * 
		 * 
		 * 
		 * 
		 * BigInteger A,B; A=90; //like that line we can not insert dictly value like
		 * that (but we assigned big value like that)
		 *
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

//		BigInteger A, B, C;
		// A=90; //like that line we can not insert dictly value like that
//		A = new BigInteger("90111111111111133333333333333356666666664654454146521323223232");
//		B = new BigInteger("445444444444444444444444555555555555555555111111111114545457727235565656");

		// C = A+B; // this is not allowed in BigInteger

		// for addition
//		C = A.add(B);

//		System.out.println(C);
		/*
		 * for Sunstraction C = A.subtract(B)
		 * 
		 * for multilpication C = A.multiply(B);
		 * 
		 * for division C = A.divide(B);
		 */

		/*
		 * parsing convert int into BigInteger A = BigInteger.valueOf(5000);
		 */

		/*
		 * parsing convert BigInteger into int int a; a = A.intValue(); a=
		 * A.longValue(); a= A.byteValue();
		 * 
		 * But that variable must accommodate that value ex.long can not accommodate to
		 * int type
		 * 
		 */

		/*
		 * converted into String type String str = A.toString();
		 */

	}

}
