package msa02;
/*
 * ����for��
 * 
 */
public class ForTest3 {

	public static void main(String[] args) {
		
		/*
		 * 12345
		 * 12345
		 * 12345
		 */
		
		for(int i=1;  i<=3; i++) { //������
			for(int j=1; j<=5; j++) { //������
				System.out.print(j+" ");
			}
			System.out.println(); //�ٹٲ�
		}
		
		
		System.out.println();
		/*
		 * 1111
		 * 2222
		 * 3333
		 */
		
		for(int i=1; i<=3; i++) { //������
			for(int j=0; j<4; j++) {
				System.out.print(i+" ");
			}
			System.out.println(); //�ٹٲ�
		}
		

		
		System.out.println();
		
		System.out.println("----�����ܹ���----");
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=5; j++) {
				System.out.print(j+" * "+i+" = "+(i*j)+"\t");
			}
			System.out.println();
			
		}
		
		
		System.out.println();
		
		System.out.println("---- ����� ----");
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=4; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		System.out.println("---- ��ܽ� ����� ----");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("---- ��ܽ� �Ųٷκ���� ----");
		
		for(int i=0; i<=4; i++) {
			for(int j=4; j<=0; j--) {
	
				
			}
			System.out.println();
		}


	}

}
