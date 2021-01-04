package HundreadJavaProgram;

import java.util.Scanner;

public class CommondLineArgument {

	public static void main(String[] args) {
//
//		String s, s1;
//		System.out.println("Enter two String");
//
//		Scanner in = new Scanner(System.in);
//		s = in.nextLine();
//		s1 = in.nextLine();
		for (String t : args) {

			System.out.println(t);
		}
	}

}
