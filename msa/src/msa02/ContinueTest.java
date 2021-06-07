package msa02;

public class ContinueTest {

	public static void main(String[] args) {
		
		
		//for문 예제
		for(int i=1; i<=5; i++) {
			if(i%2==0)
				continue; //아래 문장 무시하고 계속해서 반복문 진행
			
			System.out.print(i+" ");  // 1 3 5
		}
		
		System.out.println();
		//while문 예제
				//주의점 : continue를 증감 이후에 써야함
		int i=0;
		while(i<5) {
			
			i++;
			if(i%2==0)
				continue; //아래 문장 무시하고 계속해서 반복문 진행

			System.out.print(i+" ");  // 1 3 5
		}
		
		

	}

}
