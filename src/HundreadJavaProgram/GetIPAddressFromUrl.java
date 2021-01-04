package HundreadJavaProgram;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class GetIPAddressFromUrl {

	public static void main(String[] args) throws UnknownHostException, MalformedURLException {
		try {
			InetAddress ip = InetAddress.getByName("www.google.com");
			System.out.println("Host Name: " + ip.getHostName());
			System.out.println("IP Address: " + ip.getHostAddress());
			System.out.println(InetAddress.getLocalHost());
		} catch (Exception e) {
			System.out.println(e);
		}

		
		
		
//		System.out.println(InetAddress.getByName("www.google.com"));
		
		
		
		
//		URL url = null;
//		HttpURLConnection connection = null;
//		String message = null;
//		try {
//			url =new URL("https://www.google.com/");
//			connection = (HttpURLConnection)url.openConnection();
//			connection.connect();
//			message = connection.getResponseMessage();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println(message);
//		
		
		
	}

}
