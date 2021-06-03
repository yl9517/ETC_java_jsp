package msa04;

import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		// 1. int 저장할 배열 크기 3개를 만들어서 Scanner를 이용하여 값 입력
		// 2. 출력

		int[] arr = new int[3];
		
		Scanner sc = new Scanner(System.in);
		
		//입력
		for(int i=0; i<arr.length; i++) {
			System.out.print(i+"번째에 들어갈 값을 입력해주세요: ");
			arr[i] = sc.nextInt();
		}
		
		//출력
		for(int i=0; i<arr.length; i++) 
			System.out.print(arr[i]);
		
		
		
	}

}
