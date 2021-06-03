package msa04;
/*
 * 배열 (참조변수 : reference value)
 * 
 * int[] arr = new int[배열의 갯수]
 * 
 * arr = int 배열을 "참조하는(가르키는)" 변수
 * 
 */
public class ArrayTest {

	public static void main(String[] args) {
		int[] arr;
		arr = new int[3];  // arr = int 배열을 "참조하는(가르키는)" 변수
		
		int[] arr2 = new int[3];
		
		//new를 쓴 heap 메모리는 초기값을 0으로 만들어줌
		
		for(int i=0; i<3; i++) {
			System.out.print(arr[i]);  //000
		}
		System.out.println("\n------");
		
		
		for(int i=0; i<3; i++){
			System.out.print(arr2[i]);  //000
		}
		
		
		
	}

}
