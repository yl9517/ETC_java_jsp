package msa02;

import java.util.Scanner;

public class ForTest1 {

	public static void main(String[] args) {

		// �ʱⰪ; ���ǹ� ; ������
		for(int i=1; i<5; i++) { //�������� - �ش����������� ��밡�� (local variable)
			System.out.println("Hello");
		}
		// for�̶�� ���� �ȿ��� ������ i ������ for�� �ۿ��� ������ �ϸ� ������
		
		
		System.out.println("-----2-----");
		for(int i=10; i>=20; i++) {
			System.out.println(i);     //��� �ȳ���
		}						 
		// i�� �ʱⰪ�� 10, ���ǹ��� 20���� ���ų� Ŀ������ �����ϹǷ� �ٷ� ���������� �Ǿ ����� ���� (���������� ����)
		
		
		System.out.println("-----3-----");
		int su=1; //main���� ����
		for( ; su<=5; su++) {           //main���� for��������  //�ʱⰪ�� �ش����� ���� su ���
			System.out.print(su+"  ");     //1~5���� ���, 6���� ����
		}
		System.out.println(su+"\n");    //su�� ���������� 6���� ���Ͽ����Ƿ� 6���
		
		
		System.out.println("-----����-----");
		for(int i=5; i>0; i--) {  //�ʱⰪ5, ���� 0���� Ŭ������, -1�� ����
			System.out.print(i+"  ");
		}

		System.out.println("\n-----����2-----");
		for(int i=1; i<10; i+=2) {  //�ʱⰪ1, ���� 10���� ����������, +2�� ���� (i=i+2)
			System.out.print(i+"  ");
		}
		
		System.out.println("\n-----����3-----");
		for(int i=10; i>=4; i-=2) { 
			System.out.print(i+"  ");
		}
		
		System.out.println("\n-----����4-----");
		for(int i=10; i>=4; i--) {
			if(i%2==0)
				System.out.print(i+"  ");	
		}
		
		System.out.println("\n-----����5-----");
		for(int i=4; i<=20; i+=2) {
			System.out.print(i+"  ");	
		}
		
		System.out.println("\n-----����6-----");
		//su1,su2�� �Է¹޾Ƽ� su1���� su2���� �ݺ��ؼ� ���, ���� ��� 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("su1 �Է� : ");
		int su1 = sc.nextInt();
		System.out.print("su2 �Է� : ");
		int su2 = sc.nextInt();
		int sum=0;
		
		for(int i=su1; i<=su2; i++) {
				System.out.print(i+"  ");
				sum+=i;
		}
		System.out.println("\n���� : "+sum);
		
	
		
	}

}
