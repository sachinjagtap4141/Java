package HundreadJavaProgram;

import java.util.Scanner;

public class LinearSearch60 {

	public static void main(String[] args) {
//		int c, n, search, array[];
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter number of elements");
//		n = in.nextInt();
//		array = new int[n];
//		System.out.println("Enter " + n + " integers");
//
//		for (c = 0; c < n; c++)
//			array[c] = in.nextInt();
//		
//		System.out.println("Enter value to find");
//		search = in.nextInt();
//		for (c = 0; c < n; c++) {
//			if (array[c] == search) /* Searching element is present */
//			{
//				System.out.println(search + " is present at location " + (c + 1) + ".");
//				break;
//			}
//		}
//		if (c == n) /* Searching element is absent */
//			System.out.println(search + " is not present in array");

	
	
	
	int n, j, search, flag=0, array[];
	Scanner in = new Scanner(System.in);
	System.out.println("Enter no of Elements");
	n=in.nextInt();
	array = new int[n];
	System.out.println("Enter "+n+" integers");
	for(int i=0; i<n; i++) {
		array[i]=in.nextInt();
	}
	
	
	System.out.println("enter which integer u want to search");
	search=in.nextInt();
	
	for( j=0; j<n; j++) {
		if(search==array[j]) {
			System.out.println("integer found at "+ (j+1));
			flag=1;
		}
	}
	
	if(flag==0)
	System.out.println("Integer not found");
	
	
	
	
	
	}
}
