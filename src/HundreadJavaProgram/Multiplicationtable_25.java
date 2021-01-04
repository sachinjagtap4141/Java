package HundreadJavaProgram;

import java.util.Scanner;

public class Multiplicationtable_25 {

	public static void main(String args[])
	{
	int n, c;
	System.out.println("Enter an integer to print it's multiplicationtable");
	Scanner in = new Scanner(System.in);
	n = in.nextInt();
	System.out.println("Multiplication table of "+n+" is :-");
	for ( c = 1 ; c <= 10 ; c++ )
	System.out.println(n+"*"+c+" = "+(n*c));
	
/*	
	System.out.println("Enter integer for multiplication table");
	Scanner s = new Scanner(System.in);
	n=s.nextInt();
	System.out.println("Multiplication table of "+n+"is");
	for(int i=1;i<=10;i++){
		System.out.println(n+"*"+i+"= "+(n*i));
	}
*/	
	
	
	
	
	
	
	
	
	
	
	}

}
