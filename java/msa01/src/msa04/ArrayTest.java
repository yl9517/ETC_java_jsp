package msa04;
/*
 * �迭 (�������� : reference value)
 * 
 * int[] arr = new int[�迭�� ����]
 * 
 * arr = int �迭�� "�����ϴ�(����Ű��)" ����
 * 
 */
public class ArrayTest {

	public static void main(String[] args) {
		int[] arr;
		arr = new int[3];  // arr = int �迭�� "�����ϴ�(����Ű��)" ����
		
		int[] arr2 = new int[3];
		
		//new�� �� heap �޸𸮴� �ʱⰪ�� 0���� �������
		
		for(int i=0; i<3; i++) {
			System.out.print(arr[i]);  //000
		}
		System.out.println("\n------");
		
		
		for(int i=0; i<3; i++){
			System.out.print(arr2[i]);  //000
		}
		
		
		
	}

}
