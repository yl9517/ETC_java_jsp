package msa01;
/* 
 * 비트연산 참고
 */
public class OpTest5 {

	public static void main(String[] args) {
		
		byte su=10;  //0000 1010
		byte su2=4;  //0000 0100
		
		System.out.println(su&su2); //0000
		System.out.println(su|su2); //1110
		System.out.println(su^su2); //1110
		System.err.println(~su);  //0000 1010 => 1111 0101  
								 // 음수 2의 보수 : 1의보수+1 //2의보수 : 1의 보수 + 1 => - 0 0 0 0 1 0 1 0  +1
																			// - (8+2+1)
		
		System.out.println("===");
		System.out.println(su<<2);  //왼쪽으로 2칸 이동  // 00001010 => 00101000 //40
		System.out.println(su>>3);  //오른쪽으로 3칸 이동 // 00001010 => 00000001 //1
		
		
	}

}
