package msa03;

import java.util.Scanner;

/*
 * 0~100�� ������ ���� �Է¹޾Ƽ� a-f���� ���
 * (0���� ���� �� �Է½� ���޼���)
 * 
 * 
 */
public class DoubleWhileTest4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int score=0;
		String rank ="";
		
		while(true) {
			System.out.print("������ �Է��Ͻÿ� : ");
			score = sc.nextInt();
			
			if(score<0) {
				System.out.println("������ �߸� �Է��߽��ϴ�.\n");
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
			
			System.out.println("���� : "+score);
			System.out.println("���� : "+rank);
			System.out.println();
			
			String answer = "";
			boolean re = false;
			
			while(true) {
				
				System.out.println("�ٽ� �Է��ұ��?(y/n)");
				answer = sc.next();
				
				if(answer.equals("N") || answer.equals("n")){
					re= true;
					break;
				}
				else if(answer.equals("Y") || answer.equals("y"))
					break;
				
				else 
					System.out.println("���ڸ� �߸� �Է��Ͽ����ϴ�.");
				
				
			} //while�� ��
			
			if(re==true) 
				break;
			

			
		} //while�� ��

	}

}
