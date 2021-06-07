package msa01;

//if (~라면) : 조건문

/*
 *  if(조건식)
 *  	명령문
 *  
 *  if(조건식) {
 *  	명령문1
 *  	명령문2
 *  }
 *  else {  //그렇지 않으면
 *  	명령문3
 *  }
 * 
 * 
 */

public class IfTest {

	public static void main(String[] args) {

		int score=70;
		
		if(score>=60) 
			System.out.println("합격입니다.\n당신의 점수는 "+score+"입니다");
		else
			System.out.println("불합격입니다");
		
		
		int score2=50;
		System.out.println("당신의 점수는 "+score+"입니다");
		if(score2>=60) {
			System.out.println("결과 : 합격");
			System.out.println("축하합니다.");
		}
		else {
			System.out.println("결과 : 불합격");
		}

		
		
	}

}
