package HundreadJavaProgram;

import java.math.BigInteger;

public class UseOfBigIntegerClass {

	public static void main(String[] args) {
		
		
		/*
		 * 		size of Some data types
		 * 	1.byte1
		 * 	2.short
		 * 	3.int
		 * 	4.long
		 * 
		 * 
		 * 		formula to calculate size(range)
		 * ==========byte=================
		 * 1byte = 8 bit
		 * among that 1 bit for sign and 7 bit bit for value
		 * so that range is 2^7= -128 to 127 
		 * ==========short===================
		 * 2byte
		 * 
		 * 2^15= -32768 to 32767
		 * ===========int============
		 * 4byte=8*4=32
		 * 
		 * 
		 * 2^31 = -2147483648 to 2147483647 
		 * ===========long============
		 * 8byte
		 * 8*8=64 bit
		 * 
		 * 
		 * 
		 * 2^63=9223372036854775808 to 9223372036854775807 
		 * ---------------------------------------------------
		 * ===================================================
		 * 
		 */
		
		
		
		
		int a;
		BigInteger A,B,C;
		
		//we can not put direct value into BigInteger
		//we have to create a object and then pass String value or byte array
		
		
		A= new BigInteger("5454545555555555666666666661211111111");
		B= new BigInteger("3212"
				+ ""
				+ "686323"
				+ "355534684543534534534354345");
		

		
		C=A.add(B);
		C=A.subtract(B);
		C=A.multiply(B);
		C=A.divide(B);
		
//		above function we have to use
//				canot do like a+b or a-b
		
		/*
		//some more functions
		 a=50;
		 A=BigInteger.valueOf(a);//converting int into BigInteger
		 //or 
		 A=BigInteger.valueOf(5000);//converting int into BigInteger by directly passing value
		
		*/
		
		
		
		//converting BigInteger into Integer
		a=A.intValue();//but value must within range of integer
		
		String s =A.toString();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
