package msa04;
/*
 * value : ��
 * 
 * variable : ����
 * 
 */
public class ArrayTest2 {

	public static void main(String[] args) {

//		int su = 10; //�ʱ�ȭ
//		
//		int su2;
//			su2=10;  //������ ���� �Ҵ���
		
		int[] arr = new int[3];
		System.out.println(arr.length); //length : �ش� ��ü�� �ڸ���
		
		for(int i=0; i<arr.length; i++) 
			System.out.println(arr[i]);
		
		
		System.out.println("-----------");
		
		//�� �Ҵ�����
		arr[0] = 100;
		arr[1] = 200;
		
		for(int i=0; i<arr.length; i++) 
			System.out.println(arr[i]);
		
		
		System.out.println("-----------");
		
		
		int[] arr2= {10,20,30,40}; 		//�ٷ� �ʱⰪ �־��ֱ�
		
		for(int i=0; i<arr2.length; i++) 
			System.out.println(arr2[i]);
		
		
		
		
	}

}
