package HundreadJavaProgram;

import java.util.Scanner;

public class ReverseString30 {

	public static void main(String args[]) {
	
//		String original, reverse = "";
//		
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter a string to reverse");
//		
//		original = in.nextLine();
//		int length = original.length();
//		for (int i = length - 1; i >= 0; i--)
//			reverse = reverse + original.charAt(i);
//		System.out.println("Reverse of entered string is: " + reverse);
//		
//		
		
		
		//1st method
		String s="google";
		String rev="";
		int length=s.length();
		for(int i=length-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);

		/*
		//2nd method
		String s = "sachin";
		StringBuffer a = new StringBuffer(s);
		System.out.println(a.reverse());
		*/
		
		
		//2nd method
// 		String s = "sachin";
//		StringBuffer sb = new StringBuffer(s);
//		System.out.println(sb.reverse());
//		System.out.println(sb);
//		
		
		//1st method
		
		
//		String s= "sachin",rev ="";
//		
//		for(int i=s.length()-1; i>=0;i--) {
//			rev = rev+s.charAt(i);
//		}
//		System.out.println(rev);
//		
		
		
		
		
		
		
		
	}

}
