package msa02;
/*
 * 이중for문
 * 
 */
public class ForTest3 {

	public static void main(String[] args) {
		
		/*
		 * 12345
		 * 12345
		 * 12345
		 */
		
		for(int i=1;  i<=3; i++) { //세로줄
			for(int j=1; j<=5; j++) { //가로줄
				System.out.print(j+" ");
			}
			System.out.println(); //줄바꿈
		}
		
		
		System.out.println();
		/*
		 * 1111
		 * 2222
		 * 3333
		 */
		
		for(int i=1; i<=3; i++) { //세로줄
			for(int j=0; j<4; j++) {
				System.out.print(i+" ");
			}
			System.out.println(); //줄바꿈
		}
		

		
		System.out.println();
		
		System.out.println("----구구단문제----");
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=5; j++) {
				System.out.print(j+" * "+i+" = "+(i*j)+"\t");
			}
			System.out.println();
			
		}
		
		
		System.out.println();
		
		System.out.println("---- 별찍기 ----");
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=4; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		System.out.println("---- 계단식 별찍기 ----");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("---- 계단식 거꾸로별찍기 ----");
		
		for(int i=0; i<=4; i++) {
			for(int j=4; j<=0; j--) {
	
				
			}
			System.out.println();
		}


	}

}
