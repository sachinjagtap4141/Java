package HundreadJavaProgram;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class WriteDataIntoTextFile {

	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
			fout.write(65);
			fout.write(65);
			fout.write(65);
			fout.write(65);

			fout.close();
			System.out.println("success.. by Technolamror.");
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			FileInputStream fin = new FileInputStream("D:\\Technolamror.txt");
			int i = fin.read();
			System.out.print((char) i);
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
