package msa07;
//�ִ� 10������ �̸�,����,���� �Է¹޾� ����,���,���뵵 ���
//���� ������ ������ ����, �迭�� �Է�
/*
 *�Է¿��� ) �Է��� �ο����� ? [2]  //11�̻� �Է½� -> �ο��� �߸� �Է��Ͽ����ϴ�.
 *        �̸� : [�̸�]
 *        ���� : [����]
 *        ���� : [����]
 *        ...
 *
 * ��¿���) �̸�   ����   ����   ����    ���   ���뵵
 *        ȫ�浿  80  70  150  75   C
 *        ȫ���  60  40  100  50   F
 * 
 */

import java.util.Scanner;

class Student{
	//�ʵ�
	String name;
	int kor;
	int eng;
	int tot;
	float avg;
	char rank;
	
	//������
	public Student(String name,int kor,int eng,int tot,float avg,char rank) {
		this.name = name;
		this.kor=kor;
		this.eng = eng;
		this.tot=tot;
		this.avg=avg;
		this.rank=rank;
	}
	
	//�޼ҵ�
	
}
public class Sort_qeustion2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("�Է��� �ο����� ? : ");
		int num = sc.nextInt();
		
		if(num>10 || num<0)
			System.out.println("�ο��� �߸� �Է��Ͽ����ϴ�.");
		else {
			
			Student[] students = new Student[num]; //Student Ÿ������ �� �迭
			
			
			for(int i=0; i<num; i++) {
	
				System.out.println();
				System.out.print("�̸� : ");
				String name = sc.next();
				System.out.print("���� : ");
				int kor = sc.nextInt();
				System.out.print("���� : ");
				int eng = sc.nextInt();
				
				int tot = kor+eng;
				float avg = (float)(kor+eng)/2;
				
				char rank;
				
				if(avg>=90)
					rank = 'A';
				else if(avg>=80)
					rank = 'B';
				else if(avg>=70)
					rank = 'C';
				else if(avg>=60)
					rank = 'D';
				else
					rank = 'F';
	
				Student ins = new Student(name,kor,eng,tot,avg,rank); //�ο��� ���� �ν��Ͻ� ����
				students[i] = ins; //�� �ν��Ͻ��� s�迭�� �־��ֱ�
					
			}
			
			Student temp;
			
			//���� �������� ��������
			for(int i=0; i<students.length-1; i++) { //�л� �ο�����ŭ ������� ��
				for(int j=i+1; j<students.length; j++) { //�л� �ο�����ŭ �� ��
					
					if(students[i].tot<students[j].tot) { //������ �������� �ڸ� �ٲٱ�
						temp = students[i];
						students[i] = students[j];
						students[j] = temp;
					}
				}
			}
			System.out.println("�̸�\t����\t����\t����\t���\t���뵵");
			
			for(int i=0; i<students.length; i++) {
				System.out.println(students[i].name+"\t"+students[i].kor+"\t"+students[i].eng+"\t"+students[i].tot+"\t"+students[i].avg+"\t"+students[i].rank);
			}
		
		}
	}

}