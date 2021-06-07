package msa03;


public class DoubleWhileTest2 {

	public static void main(String[] args) {

		/*
		 * 1234
		 * 1234
		 * 1234
		 * 
		 */
		for(int i=1; i<=3; i++) {

			for(int j=1; j<=4; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
		

		System.out.println();
		/*
		 * 13579
		 * 13579
		 * 13579
		 * 
		 */

		for(int i=1; i<=3; i++) {
			for(int j=1; j<=9; j+=2) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		

		System.out.println();
		
		/*
		 * 123
		 * 456
		 * 789
		 * 101112
		 */
//		for(int i=1; i<=12; i++) {
//			
//			System.out.printf("%-3d",i);
//			
//			if(i%3==0) 
//				System.out.println();
//			
//		}
		
		int a=1;
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=3; j++) {
				System.out.print(a++ +"\t");
			}
			System.out.println();
		}
		
		
	}

}
