package msa01;
//산술연산자

public class OpTest1 {

	public static void main(String[] args) {
		
		int su1 = 10;
		int su2 = 3;
		int sum, sub, mul , re; //덧,뺄,곱,나머지
		float div; //나눗셈
		
		sum = su1+su2;
		sub = su1-su2;
		mul = su1*su2;
		div = su1/su2;  // 3.333이 안나오는 이유는 su1과 su2이 애초에 int타입이기 때문에 소수점이 나오지 않음
		re = su1%su2;	// 10%3 => 1
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(re);
		
		//소수점 나오게
		div = (float)su1/su2; //10.0을 3으로 나눌 경우 소수점까지 출력 됨 //su1,su2 둘중에 하나가 float 혹은 double타입으로 강제 형변환
		System.out.println("소수점출력 나눗셈 : "+div);
		
	}

}
