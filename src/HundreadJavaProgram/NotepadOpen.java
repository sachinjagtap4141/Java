package HundreadJavaProgram;

import java.io.IOException;

public class NotepadOpen {

	public static void main(String[] args) {
		Runtime rs = Runtime.getRuntime();
		
		Runtime rs1 = Runtime.getRuntime();
		try {
			rs1.exec("notepad");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
/*		try {
			rs.exec("C:\\Windows\\System32\\calc.exe");
		} catch (IOException e) {
			System.out.println(e);
		}
*/
//		Runtime rs1 = Runtime.getRuntime();
		/*try {
			rs.exec("notepad");
		} catch (IOException e) {
			System.out.println(e);
		} 
	*/	
		
		
		try {
		    Process p = Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		    p.waitFor();
		    System.out.println("Google Chrome launched!");
		} catch (Exception e) {
		    e.printStackTrace();
		}        

	}
}
