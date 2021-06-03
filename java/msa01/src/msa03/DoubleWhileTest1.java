package msa03;

public class DoubleWhileTest1 {

	public static void main(String[] args) {

		int i=1;
		while(i<=3) {
			
			int j=1;
			while(j<=3) {
				System.out.print("*\t");
				j++;
			}
			System.out.println();
			i++;
		}
	
		System.out.println();
		//구구단 출력
		
		System.out.println();
		
		int a=1;
		while(a<=9) {
			
			int b=2;
			while(b<=5) {
				System.out.print(b+" * "+a+" = "+(a*b)+"\t");
				b++;
			}
			System.out.println();
			a++;
		}
		
		
		
	}

}
