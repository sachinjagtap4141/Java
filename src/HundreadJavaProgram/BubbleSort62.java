package HundreadJavaProgram;

import java.util.Scanner;

public class BubbleSort62 {

	public static void main(String[] args) {

		int a[] = {36,19,2,6,22,99,29,12,5};
		int swap,temp;
		for(int i=0; i<a.length;i++) {
//			int flag=0;
			for(int j=0; j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
				temp = a[j];
				a[j]=a[j+1];
				a[j+1]=temp;

				}
			}
			
		}
		

		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

		/*
		 * int n, c, d, swap; Scanner in = new Scanner(System.in);
		 * System.out.println("Input number of integers to sort"); n = in.nextInt(); int
		 * array[] = new int[n]; System.out.println("Enter " + n + " integers"); for (c
		 * = 0; c < n; c++) array[c] = in.nextInt(); for (c = 0; c < (n - 1); c++) { for
		 * (d = 0; d < n - c - 1; d++) { if (array[d] > array[d + 1]) For descending
		 * order use < { swap = array[d]; array[d] = array[d + 1]; array[d + 1] = swap;
		 * } } } System.out.println("Sorted list of numbers");
		 * 
		 * for (c = 0; c < n; c++) System.out.print(array[c] +" ");
		 */
	}
}
