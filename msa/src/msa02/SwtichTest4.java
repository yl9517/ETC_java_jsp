package msa02;

import java.util.Scanner;

/*  switch문   
 * 	switch문의 경우에는 비교연산 등 사용X
 * 
 * */
public class SwtichTest4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("hello 중 한글자 입력");
		
		String data = sc.nextLine();
		
		switch(data) {
		
		case "h" :
			System.out.print("h");
		case "e" :
			System.out.print("e");
		case "l" :
			System.out.print("ll");
		case "o" :
			System.out.print("o");
			break;
		default :
			System.out.print("잘못 입력하였습니다");
		}
		

	}

}
