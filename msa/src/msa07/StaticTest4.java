package msa07;

class Final2{

	static final int su=10; //static final �̶�� ������ �� ���� ��
	static final int[] su2; //Ŭ���� ����
	static {  //���⼭ Ŭ���� ���� �ʱ�ȭ  //��ó�� �ѹ� ������ (����-test5)
		su2 = new int[3];
		
		for(int i=0; i<su2.length; i++)
			su2[i]=i*100;
		
	}
	
	
}

public class StaticTest4 {

	public static void main(String[] args) {
		int[] arr = Final2.su2;
		
		for(int index:arr)
			System.out.println(index);
		
	}

}
