package HundreadJavaProgram;

public class StarPattern3333 {

	public static void main(String[] args) {
		int row, numberOfStars;
		for (row = 1; row <= 10; row++) {
			for(numberOfStars=10;numberOfStars>10-row;numberOfStars--){
			
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
