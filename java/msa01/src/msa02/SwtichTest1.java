package msa02;
/*  switch��   
 * 	switch���� ��쿡�� �񱳿��� �� ���X
 * 
 * */
public class SwtichTest1 {

	public static void main(String[] args) {
		
		int su=1;
		
		switch(su) { //�Է°����� byte,short,int, char,String Ÿ�� ���� �� ����.
		case 1 :
			System.out.println("1");
			break;
		case 2 :
			System.out.println("2");
			break;
		case 3 :
			System.out.println("3");
			break;
		default :
			System.out.println("������ ����");
		}
		
		
		String data = "They";
		
		switch(data) {
		case "He" :
			System.out.println("����");
			break;
		case "She" :
			System.out.println("����");
			break;
		case "They" :
			System.out.println("�׵�");
			break;
		default :
			System.out.println("������");
		
		}  //end switch
		

	} //end method

} //end class
