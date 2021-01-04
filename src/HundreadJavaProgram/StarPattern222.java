package HundreadJavaProgram;

public class StarPattern222 {

	public static void main(String[] args) {
		int row, numberOfStars;
		for (row = 1; row <= 5; row++) {
			for (numberOfStars = 1; numberOfStars <= 5; numberOfStars++) {
				System.out.print("*");
			}
			System.out.println(); // Go to next line
		}
	}

}
