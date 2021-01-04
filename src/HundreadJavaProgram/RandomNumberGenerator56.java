package HundreadJavaProgram;

import java.util.Random;

public class RandomNumberGenerator56 {

	public static void main(String[] args) {
		int c;
		Random t = new Random();
		// random integers in [0, 100]
		for (c = 1; c <= 99; c++) {
			System.out.println(t.nextInt(100));
		}
	}

}
