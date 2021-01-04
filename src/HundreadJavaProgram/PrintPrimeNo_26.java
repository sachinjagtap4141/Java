package HundreadJavaProgram;

import java.util.Scanner;

public class PrintPrimeNo_26 {

	public static void main(String args[]) {
		int n, status = 1, num = 3;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of prime numbers you want");
		n = in.nextInt();
		if (n >= 1) {
			System.out.println("First " + n + " prime numbers are :-");
			System.out.println(2);
		}
		for (int count = 2; count <= n;) {
			for (int j = 2; j <= num-1; j++) { //Math.sqrt(num)
				if (num % j == 0) {
					status = 0;
					break;
				}
			}
			if (status != 0) {
				System.out.println(num);
				count++;
			}
			status = 1;
			num++; 
			// }
			//
			// int number = 97;
			// int temp = 0;
			// for (int n = 2; n <= number; n++) {
			// for (int i = 2; i <= n - 1; i++) {
			// if (n % i == 0) {
			// temp = temp + 1;
			// }
			// }
			// if (temp == 0) {
			// System.out.println(n);
			// } else {
			// temp = 0;
			// }
			// }
		}
	}
}
