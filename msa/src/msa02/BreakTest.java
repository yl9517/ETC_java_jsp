package msa02;

import java.util.Scanner;

/*
 * 
 *  break : �ݺ���(for,while) or Switch ���� ���������� ��ɾ�
 * 
 * 
 */
public class BreakTest {
	public static void main(String[] args) {

		for(int i=1; i<=10;i++) {
			if(i==5)
				break; //for�� ��������
			System.out.println(i);
		}


		Scanner sc = new Scanner(System.in);
//
//		int su=0;
//		while(true) {
//			System.out.print("input su : ");
//			su= sc.nextInt();
//
//			if(su==0)    //0�Է½� while�� ����������
//				break;
//			System.out.println(su);
//		}

		
		String data="";
		while(true) {
			System.out.print("���ڸ� �Է��ϼ��� : ");
			data= sc.next();		
			System.out.println(data);
			
			System.out.print("��� �Է��ұ��? : ");	
			String yn=sc.next();
			
			if(yn.equals("n")) //���ڿ� �񱳽ÿ��� ==�� �ƴ� equals
				break;
			
		}



	}
}
