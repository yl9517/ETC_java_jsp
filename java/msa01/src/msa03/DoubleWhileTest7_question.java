package msa03;

import java.util.Scanner;

/*

4������

1~20���� ¦����, Ȧ����, ���� ���
(for,while�̿�)


 */
public class DoubleWhileTest7_question {

	public static void main(String[] args) {
		
		//for �̿�
		int sum1=0,sum2=0;
		
		for(int i=1; i<=20; i++) {
			if(i%2==1) { //Ȧ��
				sum1+=i; 
			}
			else {		//¦��
				sum2+=i;
			}
		}
		System.out.println("Ȧ�� ��:"+sum1);
		System.out.println("¦�� ��:"+sum2);
		System.out.println("���� : "+(sum1+sum2));
		
		System.out.println();
		System.out.println("==while����==");
		
		
		//while �̿�
		int sum3=0, sum4=0;
		int i=1;
		while(i<=20) {
			if(i%2==1) { //Ȧ��
				sum3+=i;
			}
			else {	//¦��
				sum4+=i;
			}
			i++;
		}
		System.out.println("Ȧ�� ��:"+sum3);
		System.out.println("¦�� ��:"+sum4);
		System.out.println("���� : "+(sum3+sum4));
		

	}

}
