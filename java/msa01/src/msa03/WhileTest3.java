package msa03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


/*
 * ��� Ȧ�������� ����ϵ� ������ �Է°����� �۰ų� ���������� ���
 * 
 * �Է�) 10
 * ���) 1+3+5  (+7+9 ������ ������ 10�� �����Ƿ� ����)
 * 
 * 
 * 
 */
public class WhileTest3 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===����(for)==="); //�Է°������� ��
		
		System.out.print("input num : ");
		int su = sc.nextInt();
		int sum=0;
		
		for(int i=1; ; i++) {
			if(i%2==1) {
				sum+=i;
				if(sum>su)  //������ �Է°����� Ŀ���� ����
					break;
				
				System.out.print(i+" ");
			}
			
		}
		
		
		//------------------------------------
		System.out.println();
		System.out.println();
		System.out.println("===����(while)==="); //�Է°������� ��
		
		
		System.out.print("input num : ");
		int num = sc.nextInt();
		int sum2 = 0;
		int i=0;
		while(true) {
			i++;
			if(i%2==1) {
				sum2+=i;
				
				if(sum2>num) 
					break;
				
				System.out.print(i+" ");
			}	
		}

	
		
	}

}
