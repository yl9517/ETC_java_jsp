package msa03;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("===����(for)==="); //�Է°������� ��
		
		System.out.print("input num : ");
		int su = sc.nextInt();
		int sum=0;
		
		for(int i=1; i<=su; i++) {

			System.out.print(i +" ");
			sum+=i;
		}
		System.out.println("\n�հ� : "+sum);
		
		

		System.out.println();
		System.out.println("===����(while)==="); //�Է°������� ��
		
		System.out.print("input num : ");
		int num = sc.nextInt();
		
		int i=1;
		sum =0;
		while(i<=num) {
			
			System.out.print(i +" ");
			sum+=i;
			i++;
		}
		System.out.println("\nwhile�հ� : "+sum);
		
		
		
		
		System.out.println();
		System.out.println("===����2===");
		// �Է�) 5
		// ���) + - + - +
		
		
		System.out.print("���� �Է� : ");
		int number = sc.nextInt();
		
		i = 1;
		String result = "";
		while(i<=number) {
			if(i%2==0) {
				result+=" - ";
			}
			else {
				result+=" + ";
			}
			i++;
		}
		System.out.println(result);
		
		
		
		System.out.println();
		System.out.println("===����3 ���丮��===");
		// �Է�) 5
		// ���) 5! = 5*4*3*2*1 = 120
		
		System.out.print("���� �Է� : ");
		int fac = sc.nextInt();
		int result2 =1;
		
		System.out.print(fac+"! = ");
		
		while(fac>=1) {
			if(fac!=1) {
				System.out.print(fac+" * ");
			}
			else {
				System.out.print(fac);
			}
			result2*=fac;
			fac--;
		}
		
		System.out.println(" = "+result2);
		
		
	}

}
