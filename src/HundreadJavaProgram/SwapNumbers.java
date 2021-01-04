package HundreadJavaProgram;

import java.util.Scanner;

public class SwapNumbers {

	/*
	 * Using 3rd variable 
	 */
	
	public static void main(String[] args) {
		int x,y,temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		x=s.nextInt();
		y=s.nextInt();
		System.out.println("Before Swapping\nx=" + x + "\ny="+y);
		
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("After Swapping\nx=" + x + "\ny="+y);
		
	}
	
	
	
}
