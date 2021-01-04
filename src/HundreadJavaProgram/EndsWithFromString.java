package HundreadJavaProgram;

public class EndsWithFromString {

	public static void main(String[] args) {

		
		
		String s1="java by TechnoLamror";
		System.out.println(s1.endsWith("r")); //true
		System.out.println(s1.endsWith("Lamror")); //true
		System.out.println(s1.endsWith("lamror"));//false
		
		System.out.println(s1.startsWith("java")); //true
		System.out.println(s1.startsWith("Java")); //false
		System.out.println(s1.startsWith("java b")); //true
		System.out.println(s1.startsWith("java  b")); //false
		System.out.println(s1.startsWith("java  ")); //false
		
	}

}
