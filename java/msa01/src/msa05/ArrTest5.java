package msa05;
/*
 * �������迭
 * 
 */
public class ArrTest5 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][];
		
		arr[0] = new int[3];   // 0��° ����� 3���� ����
		arr[1] = new int[5];   // 1��° ����� 5���� ����
		arr[2] = new int[7];   // 2��° ����� 7���� ����

		for(int i=0; i<arr.length; i++) { 
			for(int j=0; j<arr[i].length; j++) { //i������ ���̱���
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		
		
	}

}
