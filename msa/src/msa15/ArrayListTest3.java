package msa15;


import java.util.ArrayList;
import java.util.Date;


public class ArrayListTest3 {

	public static void main(String[] args) {

		ArrayList arr = new ArrayList();
		
//		arr.add(new Integer(10));	//������ �̷��� �����־���� ��
//		int su = ((Integer) arr.get(0)).intValue();
		
		arr.add(10); //�⺻Ÿ���� �˾Ƽ� object��ü�� ������  �� Auto boxing
		int su2 = (Integer) arr.get(0);  //integer�� ����ȯ�� ��ü�� primitiveŸ������ �ٲ� (�ڽ��� Ǯ����) �� Auto Unboxing
				
		
				System.out.println("\n--------------------");
		
				
		ArrayList<Integer> arr2 = new ArrayList<Integer>();

		arr2.add(10);
		arr2.add(20);
		arr2.add(30);
		
		int data1 = arr2.get(0);  //Unboxing
		int data2 = arr2.get(1); 
		
		System.out.println(data1+data2);
		
		System.out.println(10+new Integer(20));
		
		
	}
	
}
