package CollectionProperties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\sachin\\Downloads\\Java\\PropertiesDemo.properties");
 
		prop.load(fis);
		
		System.out.println(prop);
		
		
		
		String s = prop.getProperty("venki");
		System.out.println(s);
		
		prop.setProperty("nag", "8889");
		System.out.println(prop);
		FileOutputStream fos = new FileOutputStream("C:\\Users\\sachin\\Downloads\\Java\\PropertiesDemo.properties");
		
		prop.store(fos, "Updated by Sachin");
		
		
	}
	
	
}
