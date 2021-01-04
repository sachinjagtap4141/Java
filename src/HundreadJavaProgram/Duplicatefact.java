package HundreadJavaProgram;

import java.math.BigInteger;
import java.util.Scanner;

public class Duplicatefact {

	public static void main(String args[]) {
//		int n, c;
//		BigInteger inc = new BigInteger("1");
//		BigInteger fact = new BigInteger("1");
//		Scanner input = new Scanner(System.in);
//		System.out.println("Input an integer");
//		n = input.nextInt();
//		for (c = 1; c <= n; c++) {
//			fact = fact.multiply(inc);
//			inc = inc.add(BigInteger.ONE);
//		}
//		System.out.println(n + "! = " + fact);

		int s, n;
		Scanner input = new Scanner(System.in);
		System.out.println("Input an integer");
		n = input.nextInt();
		BigInteger fact = new BigInteger("1");
		for (int c = 1; c <= n; c++) {
			fact = fact.multiply(BigInteger.valueOf(c));
		}
		System.out.println(fact);
	}
	
}
