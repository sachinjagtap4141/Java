package HundreadJavaProgram;

import java.sql.Date;

public class CovertStringIntoSqlDate {

	public static void main(String[] args) {
		String str="2015-03-31";
		Date date=Date.valueOf(str);//converting string into sql date
		System.out.println(date);
		System.out.println(date.getClass());
	}

}
