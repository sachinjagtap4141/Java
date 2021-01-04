package HundreadJavaProgram;

import java.util.Scanner;

public class DuplicateTemoerature {


	public static void main(String[] args) {
		float temperature;
		Scanner s = new Scanner(System.in);
			

		System.out.println("Enter Temperature in faranhit");
		temperature = s.nextFloat();
		temperature = ((temperature-32)*5)/9;
		System.out.println(temperature);
	}
	
	
	
}
