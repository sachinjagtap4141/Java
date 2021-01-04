package HundreadJavaProgram;

import java.util.Scanner;

public class MultiplicationTableForanyNumber_25_2 {

	public static void main(String[] args) {

		int a, b, c, d;

		System.out.println("Enter the range to print their multiplication table");
		Scanner in = new Scanner(System.in);

		a=in.nextInt();
		b=in.nextInt();
			
		for(c=a;c<=b;c++){
			System.out.println("Multi[licaton table for "+c);
			for(d=1;d<=10;d++){
				System.out.println(c+"*"+d+"="+(c*d));
			}
		}
			
	}
}