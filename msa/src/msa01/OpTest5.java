package msa01;
/* 
 * ��Ʈ���� ����
 */
public class OpTest5 {

	public static void main(String[] args) {
		
		byte su=10;  //0000 1010
		byte su2=4;  //0000 0100
		
		System.out.println(su&su2); //0000
		System.out.println(su|su2); //1110
		System.out.println(su^su2); //1110
		System.err.println(~su);  //0000 1010 => 1111 0101  
								 // ���� 2�� ���� : 1�Ǻ���+1 //2�Ǻ��� : 1�� ���� + 1 => - 0 0 0 0 1 0 1 0  +1
																			// - (8+2+1)
		
		System.out.println("===");
		System.out.println(su<<2);  //�������� 2ĭ �̵�  // 00001010 => 00101000 //40
		System.out.println(su>>3);  //���������� 3ĭ �̵� // 00001010 => 00000001 //1
		
		
	}

}
