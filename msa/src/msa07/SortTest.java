package msa07;
/*
 * ���� (��������/��������/��������)
 * �������� : ���� ���ڰ� ���������� ����
 * 
 * �⺻ : ��������
 * 0������ ���� ���� ��, ������ ������ �ڸ� �ٲٱ�
 * 1��°�� ���� ���� ��, ������ ������ �ڸ� �ٲٱ�
 */
public class SortTest {

	public static void main(String[] args) {
		
		int[] arr = {20,52,30,10,31,5};
		int temp;
		
		for(int i=0;i<arr.length-1; i++) { //���� ���� 5���� ������
			
			for(int j=i+1; j<arr.length; j++) { //�񱳴���� ���� �� 5���� ������
				
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i:arr)
			System.out.print(i+" ");

	}

}
