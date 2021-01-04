package HundreadJavaProgram;

import java.util.Scanner;

public class MatricsMultiplication_33_3_copy {

	public static void main(String[] args) {

		
		int a[][] = new int[3][3],b[][] = new int[3][3],c[][] = new int[3][3],i,j,k;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter numvber in first matrics");
		for(i=0;i<3;i++) {
		
			for(j=0;j<3;j++) {
				
				System.out.println("Enter value for ["+i+"]["+j+"]");
				
				a[i][j]=sc.nextInt();
				
			}

		}
			
			System.out.println("Enter number in second matrics");
			for(i=0;i<3;i++) {
			
				for(j=0;j<3;j++) {
					
					System.out.println("Enter value for ["+i+"]["+j+"]");
					b[i][j]=sc.nextInt();
				}

			}
		
			System.out.println("First matrics.....");

			for(i=0;i<3;i++) {
				
				for(j=0;j<3;j++) {

					System.out.print(a[i][j]+" ");
				}

				System.out.println();
			}
			
			
			System.out.println("Second matrics.....");

			for(i=0;i<3;i++) {
				
				for(j=0;j<3;j++) {

					System.out.print(b[i][j]+" ");
				}

				System.out.println();
			}

			
			
			for(i=0;i<3;i++) {

				for(j=0;j<3;j++) {
				
					c[i][j]=0;
					for(k=0;k<3;k++) {
						
						c[i][j]+=a[i][k]*b[k][j];
						
						
						
					}

					
				}

			}
		

			
			System.out.println("Matrics Multiplication is:");
			

			for(i=0;i<3;i++) {
				
				for(j=0;j<3;j++) {

					System.out.print(c[i][j]+" ");
				}

				System.out.println();
			}
		
		
	}
	
	

		
		
		
		
	}


