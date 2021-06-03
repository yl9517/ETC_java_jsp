package msa04;

import java.util.Scanner;

/*
국,영,수 입력받기

모두 90이면 excellent
한과목이라도 90이상이면 good
모두 90미만이면 bad


 */
public class Hw4_if {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input name: ");
		String name = sc.next();
		System.out.print("input kor: ");
		int kor = sc.nextInt();
		System.out.print("input eng: ");
		int eng = sc.nextInt();
		System.out.print("input math: ");
		int math = sc.nextInt();
		
		String rank = "";
		
		if(kor>=90 && eng>=90 && math>=90) {
			rank="excellent";
		}
		else if(kor>=90 || eng>=90 || math>=90) {
			rank="good";
		}
		else {
			rank="bad";
		}

		System.out.println("이름 : "+name);
		System.out.printf("국어 : %d, 영어: %d, 수학: %d\n", kor,eng,math);
		System.out.println("성취도 :"+rank);
		

	}

}
