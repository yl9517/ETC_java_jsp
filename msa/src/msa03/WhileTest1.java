package msa03;

import java.util.Scanner;

public class WhileTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input su2 : ");
		int su2 = sc.nextInt();
		
		int i=1;
		int result2 =1;
		String process2 = "1";
		
		while(i<su2) {
			i++;
			
			if(i%2==0) {//¦�� -���
				process2+=" - "+i;
				result2-=i;
			}
			else { //Ȧ�� +���
				process2+=" + "+i;
				result2+=i;
			}
			
		}
		System.out.println(process2 + " = "+result2);
		
		
		
		System.out.println();
		System.out.println("===��������===");
		// 1 3 5 7 9
		
		int j = 0;
		while(j<9) {
			j++;
			if(j%2==1) 
				System.out.print(j+" ");
			
		}
		

		System.out.println();
		System.out.println("===����1==="); // 5 6 7 8 9 10
		
		int a=5;
		while(a<=10) {
			System.out.print(a+" ");
			a++;
		}
		
		System.out.println();
		System.out.println("===����2==="); // 10 9 8 7 6 5
		
		int b=10;
		while(b>=5){
			System.out.print(b+" ");
			b--;
		}
	
		
		System.out.println();
		System.out.println("===����3==="); //���۰����� ��������
		
		System.out.print("���۰� : ");
		int c = sc.nextInt();
		System.out.print("���� : ");
		int d = sc.nextInt();
		
		while(c<=d) {
			System.out.print(c+" ");
			c++;
		}
		
		
	}

}
