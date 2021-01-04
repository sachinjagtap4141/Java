package HundreadJavaProgram;

public class StringEndWith_36 {

	public static void main(String[] args) {

//		String s1="java by TechnoLamror";
//		System.out.println(s1.endsWith("r")); //true
//		System.out.println(s1.endsWith("Lamror")); //true
//		System.out.println(s1.endsWith("lamror"));//false
//		System.out.println(s1.endsWith("ror")); //true
//		

		/*
		 * String s1 = "this is index of example"; // passing substring int index1 =
		 * s1.indexOf("is");// returns the index of is substring int index2 =
		 * s1.indexOf("index");// returns the index of index substring
		 * System.out.println(index1 + " " + index2);// 2 8
		 * 
		 * 
		 * // passing substring with from index int index3 = s1.indexOf("is", 4);//
		 * returns the index of is substring after 4th index
		 * System.out.println(index3);// 5 i.e. the index of another is
		 * 
		 * // passing char value int index4=s1.indexOf('s');//returns the index of s
		 * char value System.out.println(index4);//3
		 */

		/*
		 * 40 String
		 * s1="My name is Rajendra. My name is lamror. My name is Technolamror."; String
		 * replaceString=s1.replaceAll("is","was");//replaces all occurrences of "is" to
		 * "was" System.out.println(replaceString);
		 */

		/*
		 * 41 String s1="java string split method by Technolamror"; String[]
		 * words=s1.split("\\s");//splits the string based on whitespace //using java
		 * foreach loop to print elements of string array for(String w:words){
		 * System.out.println(w); }
		 */

		/*
		 * 42 String s1=" hello string ";
		 * System.out.println(s1+"Technolamror");//without trim()
		 * System.out.println(s1.trim()+"Technolamror");//with trim()
		 */

		/*
		 * 43 String s1="TECHNOLAMROR by Rajendralamror HELLO stRIng"; String
		 * s1lower=s1.toLowerCase(); System.out.println(s1lower);
		 * System.out.println(s1lower.toUpperCase());
		 */

		/*
		 * 44 int n; String s = "Java programming", t = "", u = "";
		 * System.out.println(s); // Find length of string n = s.length();
		 * System.out.println("Number of characters = " + n); // Replace characters in
		 * string t = s.replace("Java", "C++"); System.out.println(s);
		 * System.out.println(t); // Concatenating string with another string u =
		 * s.concat(" is fun"); System.out.println(s); System.out.println(u);
		 */

		display(); // calling without object
		StringEndWith_36 t = new StringEndWith_36();
		t.show(); // calling using object
	}

	static void display() {
		System.out.println("Programming is amazing.");
	}

	void show() {
		System.out.println("Java is awesome.");
	}

}
