package msa02;

public class ContinueTest {

	public static void main(String[] args) {
		
		
		//for�� ����
		for(int i=1; i<=5; i++) {
			if(i%2==0)
				continue; //�Ʒ� ���� �����ϰ� ����ؼ� �ݺ��� ����
			
			System.out.print(i+" ");  // 1 3 5
		}
		
		System.out.println();
		//while�� ����
				//������ : continue�� ���� ���Ŀ� �����
		int i=0;
		while(i<5) {
			
			i++;
			if(i%2==0)
				continue; //�Ʒ� ���� �����ϰ� ����ؼ� �ݺ��� ����

			System.out.print(i+" ");  // 1 3 5
		}
		
		

	}

}
