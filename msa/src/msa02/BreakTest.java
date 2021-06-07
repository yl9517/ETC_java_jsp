package msa02;

import java.util.Scanner;

/*
 * 
 *  break : 반복문(for,while) or Switch 문을 빠져나오는 명령어
 * 
 * 
 */
public class BreakTest {
	public static void main(String[] args) {

		for(int i=1; i<=10;i++) {
			if(i==5)
				break; //for문 빠져나옴
			System.out.println(i);
		}


		Scanner sc = new Scanner(System.in);
//
//		int su=0;
//		while(true) {
//			System.out.print("input su : ");
//			su= sc.nextInt();
//
//			if(su==0)    //0입력시 while문 빠져나오기
//				break;
//			System.out.println(su);
//		}

		
		String data="";
		while(true) {
			System.out.print("문자를 입력하세요 : ");
			data= sc.next();		
			System.out.println(data);
			
			System.out.print("계속 입력할까요? : ");	
			String yn=sc.next();
			
			if(yn.equals("n")) //문자열 비교시에는 ==가 아닌 equals
				break;
			
		}



	}
}
