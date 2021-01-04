package HundreadJavaProgram;

public class StringToIntConversion_80 {

	public static void main(String[] args) {
		
		String s="200";
//		int i=Integer.parseInt(s);
//		System.out.println(s+100);//200100 because + is string concatenation operator
//		System.out.println(i+100);//300 because + is binary plus operator
		
		//my practice
		try{
		int i = Integer.parseInt(s);
		System.out.println(s+100);
		System.out.println(i+100);
		}catch(Exception e){
			System.out.println(e);
		}
		/*
		 *    **********Note*************
		 *    The NumberFormatException is thrown when we try to convert a string into
		 *    a numeric value such as float or integer, but the format of the input string 
		 *    is not appropriate or illegal. For example - if we try to parse a string to 
		 *    integer but the string is null. ... It is an unchecked exception.
		 */
		
		
	}
	
	
	
}
