package msa14;

import java.util.Scanner;
import java.util.StringTokenizer;

//String Tokenizer

public class StringTok {

	public static void main(String[] args) {

		StringTokenizer stk = new StringTokenizer("hong gil dong"); //�˾Ƽ�  ���� �������� �и�
		
		System.out.println(stk.countTokens()); //���� �� (���� ����)
		
		//���� ������ ����� = nextToken,nextElement
		System.out.println(stk.nextToken()); //nextToken �� return StringŸ��
		System.out.println(stk.nextToken()); //nextElement �� return ObjectŸ�� (String �� �������� ��������ȯ �ؾ���)
		System.out.println(stk.nextToken());
		
		//�ݺ��� = hasMoreTokens , hasMoreElements  �� return booleanŸ��
		while(stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}
		
		
		
		StringTokenizer stk2 = new StringTokenizer("hong,kim;lee,park",","); //,�� �������� �ڸ��ھ�
		while(stk2.hasMoreElements()) {
			String data = (String)stk2.nextElement();
			System.out.println(data);
		}
		
		
		StringTokenizer stk3 = new StringTokenizer("hong,kim;lee,park",",;"); //, �Ǵ� ; �� �������� �ڸ��ھ�
		while(stk3.hasMoreElements()) {
			String data = (String)stk3.nextElement();
			System.out.println(data);
		}
		
		System.out.println("----------");
		
		StringTokenizer stk4 = new StringTokenizer("hong,kim;lee,park",",;",true); //, �Ǵ� ; �� �������� �ڸ��µ� ���ر��� ���
		while(stk4.hasMoreElements()) {
			String data = (String)stk4.nextElement();
			System.out.println(data);
		}
		
		System.out.println();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("email : ");
		String email = sc.next();
		
		StringTokenizer stk5 = new StringTokenizer(email,"@");
		System.out.println("�̸���:"+stk5.nextToken());
		System.out.println("�̸���:"+stk5.nextToken());
		
		
		
	}

}
