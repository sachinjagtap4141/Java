
package HundreadJavaProgram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String args[]) {

//		int number = 97;
//		int temp = 0;
//		for (int n = 1; n <= number; n++) {
//			for (int i = 2; i <= n - 1; i++) {
//				if (n % i == 0) {
//					temp = temp + 1;
//				}
//			}
//			if (temp == 0) {
//				System.out.println(n);
//			} else {
//				temp = 0;
//			}
//		}
//		

//		int num;
//		int flag=1;
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter number to check prime or not");
//		num= in.nextInt();
//		for(int i=2;i<num-1;i++) {
//			if(num%i==0) {
//				flag=0;
//				break;
//			}
//		}
//		if(flag!=0) {
//			System.out.println("Given number is prime");
//		}else
//			System.out.println("given number is not prime");
//		
//		

		int num = 3;
		int flag = 1;
		int count;
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("how many prime number u want");
		n = in.nextInt();
		for (count = 2; count <= n;) {
			for (int i = 2; i < num - 1; i++) {
				if (num % i == 0) {
					flag = 0;
					break;
				}
			}
			if (flag != 0) {
				System.out.println(num);
				count++;
			}
			flag = 1;
			num++;

		}

	}
}