package msa04;

import java.util.Scanner;

/*

p135 문제7번 과제

 */
public class Hw8_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int money = 0;
		while(true) {
			System.out.println("\n-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print(" 선택 > ");
			int num=sc.nextInt();
			
			int account=0;
			if(num ==1) {
				System.out.print(" 예금액> ");	
				account=sc.nextInt();
				money+=account;
			}
			else if(num==2) {
				System.out.print(" 출금액> ");
				account=sc.nextInt();
				money-=account;
			}
			else if(num==3) {
				System.out.print(" 잔고 > "+money);
			}
			else
				break;
		}
		System.out.println("\n프로그램 종료");
	}

}
