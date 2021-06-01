package msa02;

public class WhileTest1 {

	public static void main(String[] args) {
		
		int i=8;
		while(i>3) {
			System.out.print(i+ " ");
			i--;
		}

		System.out.println("\n----");
		
		for(i=8 ; i>3; i--) {
			System.out.print(i+ " ");
		}
		
		System.out.println("\n----");
		
		i=9;
		while(i>=3) {
			System.out.print(i+ " ");
			i-=2;
		}

	}

}
