package msa14;

class Cal1{

	private int su1;
	private int su2;
	
	public Cal1(int su1,int su2) {
		this.su1=su1;
		this.su2=su2;
	}
	
	public int div() {
//		return su1/su2;  //ArithmeticException
		
	int result=0;
	
		try {
			result=su1/su2;		
		}catch (Exception e) {
			System.out.println("0으로 나누면 안돼요.");
		}
		
		return result;
	}
	
}

public class ExceptionTest4 {

	public static void main(String[] args) {
	
		Cal1 ins = new Cal1(10, 0);
		System.out.println(ins.div());


		//try..catch : 직접 개입
		
	}

}
