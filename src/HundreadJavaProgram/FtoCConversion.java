package HundreadJavaProgram;

import java.util.Scanner;

public class FtoCConversion {

	public static void main(String[] args) {

	
	 float temperatue;

	 Scanner in = new Scanner(System.in);
	 System.out.println("Enter temperatue in Fahrenheit");
	 temperatue = in.nextFloat();
	 temperatue = ((temperatue - 32)*5)/9;
	 System.out.println("Temperatue in Celsius = " + temperatue);
	 }


	 
	
}