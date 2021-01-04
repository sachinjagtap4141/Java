package HundreadJavaProgram;

import java.util.Scanner;

public class SwapNumbers2ndMethod {

	
	
	
	
	
	public static void main(String[] args) {
	
		int x,y;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		x=s.nextInt();
		y=s.nextInt();
		
		System.out.println("before swapping\nx="+x+"\ny="+y);
		//Swapping1
		/*
		x=x+y;
	
		y=x-y;
		x=x-y;
		*/
		
		//Swapping2
		x=x*y;
		
		y=x/y;
		x=x/y;
			
		
		
		System.out.println("after swapping\nx="+x+"\ny="+y);
		
	}
	
	
	
}
