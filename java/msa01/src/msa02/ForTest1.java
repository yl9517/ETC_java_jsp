package msa02;

import java.util.Scanner;

public class ForTest1 {

	public static void main(String[] args) {

		// 초기값; 조건문 ; 증감값
		for(int i=1; i<5; i++) { //지역변수 - 해당지역에서만 사용가능 (local variable)
			System.out.println("Hello");
		}
		// for이라는 지역 안에서 선언한 i 변수를 for문 밖에서 쓰려고 하면 에러남
		
		
		System.out.println("-----2-----");
		for(int i=10; i>=20; i++) {
			System.out.println(i);     //결과 안나옴
		}						 
		// i의 초기값은 10, 조건문은 20보다 같거나 커야지만 실행하므로 바로 빠져나오게 되어서 결과가 없음 (에러나지는 않음)
		
		
		System.out.println("-----3-----");
		int su=1; //main지역 변수
		for( ; su<=5; su++) {           //main안의 for지역변수  //초기값은 해당지역 밖의 su 사용
			System.out.print(su+"  ");     //1~5까지 출력, 6까지 증가
		}
		System.out.println(su+"\n");    //su가 마지막으로 6으로 변하였으므로 6출력
		
		
		System.out.println("-----문제-----");
		for(int i=5; i>0; i--) {  //초기값5, 값이 0보다 클때까지, -1씩 감소
			System.out.print(i+"  ");
		}

		System.out.println("\n-----문제2-----");
		for(int i=1; i<10; i+=2) {  //초기값1, 값이 10보다 작을때까지, +2씩 증가 (i=i+2)
			System.out.print(i+"  ");
		}
		
		System.out.println("\n-----문제3-----");
		for(int i=10; i>=4; i-=2) { 
			System.out.print(i+"  ");
		}
		
		System.out.println("\n-----문제4-----");
		for(int i=10; i>=4; i--) {
			if(i%2==0)
				System.out.print(i+"  ");	
		}
		
		System.out.println("\n-----문제5-----");
		for(int i=4; i<=20; i+=2) {
			System.out.print(i+"  ");	
		}
		
		System.out.println("\n-----문제6-----");
		//su1,su2를 입력받아서 su1부터 su2까지 반복해서 출력, 총합 계산 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("su1 입력 : ");
		int su1 = sc.nextInt();
		System.out.print("su2 입력 : ");
		int su2 = sc.nextInt();
		int sum=0;
		
		for(int i=su1; i<=su2; i++) {
				System.out.print(i+"  ");
				sum+=i;
		}
		System.out.println("\n총합 : "+sum);
		
	
		
	}

}
