package msa01;

//if (~���) : ���ǹ�

/*
 *  if(���ǽ�)
 *  	��ɹ�
 *  
 *  if(���ǽ�) {
 *  	��ɹ�1
 *  	��ɹ�2
 *  }
 *  else {  //�׷��� ������
 *  	��ɹ�3
 *  }
 * 
 * 
 */

public class IfTest {

	public static void main(String[] args) {

		int score=70;
		
		if(score>=60) 
			System.out.println("�հ��Դϴ�.\n����� ������ "+score+"�Դϴ�");
		else
			System.out.println("���հ��Դϴ�");
		
		
		int score2=50;
		System.out.println("����� ������ "+score+"�Դϴ�");
		if(score2>=60) {
			System.out.println("��� : �հ�");
			System.out.println("�����մϴ�.");
		}
		else {
			System.out.println("��� : ���հ�");
		}

		
		
	}

}
