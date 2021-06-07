package msa02;

import java.util.Scanner;

public class HwOperatorTest2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하시오");
		String name = sc.nextLine();
		
		System.out.println("input kor");
		int kor = sc.nextInt();
		System.out.println("input eng");
		int eng = sc.nextInt();
		System.out.println("input math");
		int math = sc.nextInt();
		
		int tot = kor+eng+math;
		float avg = tot/3.0f;	 // (float)tot /3

		String result="";
		if(avg>=60)
			result="합격";
		else
			result="불합격";
		
		System.out.println("name : "+name);
		System.out.println("kor : "+kor);
		System.out.println("eng : "+eng);
		System.out.println("math : "+math);
		System.out.println("total : "+tot);
		System.out.printf("avg : %.2f\n",avg);
		
		System.out.println("[결과 : "+result+"]");
		
	}

}
