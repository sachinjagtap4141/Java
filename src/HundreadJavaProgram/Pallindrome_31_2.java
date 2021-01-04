package HundreadJavaProgram;

import java.util.Scanner;

public class Pallindrome_31_2 {

	public static void main(String[] args) {
		/*
		 * String inputString; Scanner in = new Scanner(System.in);
		 * System.out.println("Input a string"); inputString = in.nextLine();
		 * int length = inputString.length(); int i, begin, end, middle; begin =
		 * 0; end = length - 1; middle = (begin + end) / 2; for (i = begin; i <=
		 * middle; i++) { if (inputString.charAt(begin) ==
		 * inputString.charAt(end)) { begin++; end--; } else { break; } } if (i
		 * == middle + 1) { System.out.println("Palindrome"); } else {
		 * System.out.println("Not a palindrome"); }
		 */

		// my practice

		String s = "sachcas";
		int length = s.length();
		int middle = length / 2;
		int end = length - 1;
		int i;
		for (i = 0; i <middle; i++) {

			if (s.charAt(i) == s.charAt(end)) {
				end--;
			} else {
				break;
			}

		}
		if (i == middle) {
			System.out.println("pallindrome");
		} else
			System.out.println("not pallindrome");

	}
}
