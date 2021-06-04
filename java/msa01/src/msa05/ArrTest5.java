package msa05;
/*
 * 이차원배열
 * 
 */
public class ArrTest5 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][];
		
		arr[0] = new int[3];   // 0번째 사람의 3가지 정보
		arr[1] = new int[5];   // 1번째 사람의 5가지 정보
		arr[2] = new int[7];   // 2번째 사람의 7가지 정보

		for(int i=0; i<arr.length; i++) { 
			for(int j=0; j<arr[i].length; j++) { //i번쨰의 길이까지
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		
		
	}

}
