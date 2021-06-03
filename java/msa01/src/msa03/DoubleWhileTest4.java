package msa03;

import java.util.Scanner;

/*
 * 0~100점 사이의 점수 입력받아서 a-f학점 출력
 * (0보다 작은 수 입력시 경고메세지)
 * 
 * 
 */
public class DoubleWhileTest4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int score=0;
		String rank ="";
		
		while(true) {
			System.out.print("점수를 입력하시오 : ");
			score = sc.nextInt();
			
			if(score<0) {
				System.out.println("점수를 잘못 입력했습니다.\n");
				continue;
			}
			else if(score>=90)
				rank = "A";	
			else if(score>=80)
				rank = "B";
			else if(score>=70)
				rank = "C";
			else if(score>=60)
				rank = "D";
			else
				rank = "F";
			
			System.out.println("점수 : "+score);
			System.out.println("학점 : "+rank);
			System.out.println();
			
			String answer = "";
			boolean re = false;
			
			while(true) {
				
				System.out.println("다시 입력할까요?(y/n)");
				answer = sc.next();
				
				if(answer.equals("N") || answer.equals("n")){
					re= true;
					break;
				}
				else if(answer.equals("Y") || answer.equals("y"))
					break;
				
				else 
					System.out.println("문자를 잘못 입력하였습니다.");
				
				
			} //while문 끝
			
			if(re==true) 
				break;
			

			
		} //while문 끝

	}

}
