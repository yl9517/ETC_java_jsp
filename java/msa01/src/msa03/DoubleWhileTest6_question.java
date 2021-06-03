package msa03;

import java.util.Scanner;

/*


	[1번] 1 - 1/2 + 1/3 - 1/4 = 값
	
	
	[2번] 입력에 따라 거꾸로 별찍기
		조건 : -값, 10초과 입력오류
	입력) 4
	출력)
 		*
 	   **
      ***
     ****
 
 
 	[3번] for과 while이용하여
 	
 		 1 입력시 + - + -
 				+ - + -
 		 2 입력시 - + - +
 		 		- + - +
 		 이 외 숫자 입력 오류
 	
 	
 */
public class DoubleWhileTest6_question {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//1번문제
		System.out.print("input su : ");
		int su = sc.nextInt();
		
		String process = "1";
		float sum=1;
		
		for(int i=2; i<=su; i++) {
			
			float add = (float)1/i;
			
			if(i%2==0) {//짝수
				process+= " - "+add;
				sum-=add;
			}
			else {
				process+=" + "+add;
				sum+=add;
			}
		}
		System.out.println(process+" = "+sum);
		
		
		
		//2번문제
		System.out.print("input num : ");
		int num = sc.nextInt();
		
		if(num<0 || num>10) 
			System.out.println("입력 오류!");
		
		else {
			
			for(int i=0; i<=num; i++) {
				for(int j=num; j>=1; j--) { //j번째가 i번째와 같은 숫자거나 작을때 *을 찍음
					if(j>i)			//j번째가 i번째줄보다 크면 공백 찍기
						System.out.print("  ");
					else 		    //j번째가 i보다 같거나 작으면 *찍기
						System.out.print(" *");
				}
				System.out.println();
			}
			
		}
	
		
		
		//3번문제 for문
    	
    	System.out.print("input 1 or 2 : ");
    	num = sc.nextInt();
    	
    	String result="";
  
    	for(int i=1; i<=2; i++) {
    		
    		for(int j = num; j<=num+4; j++) {
    			if(j%2==1) { //홀수
    				result+=" + ";
    			}
    			else {
    				result+=" - ";
    			}
    		}
    		result+="\n";
       }
       System.out.println(result);
		
	}

}
