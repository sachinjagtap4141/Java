package HundreadJavaProgram;

import java.util.Scanner;

public class DuplicateFoorLoopProgram {

	public static void main(String[] args) {

		/*
		 * char c; for (c = 'A'; c <='Z'; c++) { System.out.println(c); }
		 */

		/*
		 * int c; for (c = 70001; c <= 80000; c++) { System.out.println(c); }
		 */

		/*int row, numberOfStars;
		for (row = 1; row <= 10; row++) {
			for (numberOfStars = 1; numberOfStars <= row; numberOfStars++) {
				System.out.print("*");
			}
			System.out.println(); // Go to next line
		}
		*/
		int r,s,ss;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter rows");
		r=in.nextInt();
		ss=in.nextInt();
		System.out.println("Enter no of str");
		
		for(r=1; r<=ss; r++) {
			for(s=1; s<=r; s++) {
				System.out.print("*");
			}
			System.out.println();
			}
		
		
		

	}

}
