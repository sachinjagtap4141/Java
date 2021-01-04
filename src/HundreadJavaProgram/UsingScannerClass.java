package HundreadJavaProgram;

import java.util.Scanner;

public class UsingScannerClass {

	 public static void main(String args[]){
		 
		 int a;
		 float b;
		 String s; 
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter a String");
		 s= in.nextLine();
		 System.out.println(s);
		 
		 
		 
		 System.out.println("Enter the Integer");
		 a=in.nextInt();
		 System.out.println("You Enter the Integer "+a);
		 
		 System.out.println("Enter the Float");
		 b=in.nextFloat();
		 System.out.println("You Enter the Float "+b);
		 
		 
	 }
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
