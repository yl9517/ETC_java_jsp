package msa04;
/*
 * 문자열 배열
 * 
 * 배열크기 입력받아 해당 크기만큼 이름 입출력
 * 
 */
import java.util.Scanner;

public class ArrayTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("배열 크기: ");
		int num = sc.nextInt();
		String[] names = new String[num];
		
		for(int i=0; i<names.length; i++) {
			System.out.print("이름을 입력하세요 :");
			names[i]=sc.next();
		}
		

		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
	}

}
