package msa07;
/*
	final : ��� (������ �ʴ� ��)
 *  
 *  
 */
class Final1{
	final int su=20; //su �ʱ�ȭ
	final int su2; //�ν��Ͻ�����
	final int[] su3;
	
	//������    //��ü�� ������� ������ �����ڵ� ��������Ƿ� �����ڿ��� �����ʱ�ȭ ����
	public Final1(int su2) { //su2 �ʱ�ȭ //su3�� �ʱ�ȭ �Ǿ����� �����Ƿ� ������ �ʱ�ȭ ������ ������ �ʿ�
		
		this.su2=su2;  //�ܺ� �����ʱ�ȭ
		
		su3 = new int[4];	//���� �ʱ�ȭ
		
		for(int i:su3)
			su3[i]=i*20;
	}
	
// private �� ��
//	public void setSu(int su) { //final�̶� su ����޼ҵ� set �Ұ�
//		this.su=su;
//	}
	
	
	
	
}

public class StaticTest3 {

	public static void main(String[] args) {
		final int su =20;
		//su=40; //final�� ����� ���� ���� �Ұ�
		
		System.out.println(su);  //20
		
		final int su1;
		su1 = 100;
		//su1+=200;  //�����Ұ�
		System.out.println(su1); //100
		
	
		//-----------------------------
		
		Final1 f1 = new Final1(30);
		//f1.su2=20; //���� �Ұ�
		
		System.out.println(f1.su);   //20
		System.out.println(f1.su2);  //30
		
	}

}