package msa09;

import java.util.Scanner;

public class DogTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Dog[] arr = new Dog[5]; //배열 생성
		
		Dog ins = new Dog("","");
		
		for(int i=0; i<5; i++) {
			System.out.print("강아지 이름 입력 : ");
			String name = sc.next();
			System.out.print("강아지 종 입력 : ");
			String type = sc.next();
			
			ins = new Dog(name,type);
			arr[i] = ins;		
		}
		
		for(Dog i:arr)
			System.out.println("이름 : "+i.getName()+" | 종 : "+i.getType());

	}

}
