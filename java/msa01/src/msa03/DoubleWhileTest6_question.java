package msa03;

import java.util.Scanner;

/*


	[1��] 1 - 1/2 + 1/3 - 1/4 = ��
	
	
	[2��] �Է¿� ���� �Ųٷ� �����
		���� : -��, 10�ʰ� �Է¿���
	�Է�) 4
	���)
 		*
 	   **
      ***
     ****
 
 
 	[3��] for�� while�̿��Ͽ�
 	
 		 1 �Է½� + - + -
 				+ - + -
 		 2 �Է½� - + - +
 		 		- + - +
 		 �� �� ���� �Է� ����
 	
 	
 */
public class DoubleWhileTest6_question {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//1������
		System.out.print("input su : ");
		int su = sc.nextInt();
		
		String process = "1";
		float sum=1;
		
		for(int i=2; i<=su; i++) {
			
			float add = (float)1/i;
			
			if(i%2==0) {//¦��
				process+= " - "+add;
				sum-=add;
			}
			else {
				process+=" + "+add;
				sum+=add;
			}
		}
		System.out.println(process+" = "+sum);
		
		
		
		//2������
		System.out.print("input num : ");
		int num = sc.nextInt();
		
		if(num<0 || num>10) 
			System.out.println("�Է� ����!");
		
		else {
			
			for(int i=0; i<=num; i++) {
				for(int j=num; j>=1; j--) { //j��°�� i��°�� ���� ���ڰų� ������ *�� ����
					if(j>i)			//j��°�� i��°�ٺ��� ũ�� ���� ���
						System.out.print("  ");
					else 		    //j��°�� i���� ���ų� ������ *���
						System.out.print(" *");
				}
				System.out.println();
			}
			
		}
	
		
		
		//3������ for��
    	
    	System.out.print("input 1 or 2 : ");
    	num = sc.nextInt();
    	
    	String result="";
  
    	for(int i=1; i<=2; i++) {
    		
    		for(int j = num; j<=num+4; j++) {
    			if(j%2==1) { //Ȧ��
    				result+=" + ";
    			}
    			else {
    				result+=" - ";
    			}
    		}
    		result+="\n";
       }
       System.out.println(result);
		
	}

}
