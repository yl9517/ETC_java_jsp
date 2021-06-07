package msa06;

import java.util.Scanner;

/*
 * [문제1]
 * 1. Dog 클래스를 만들고 멤버변수 name,type 를 만들기 (모두String)
 * 2. getter,setter,생성자 생성
 * 3. dog 클래스 이용하여 dogTest클래스와 배열크기가 5인 dog[] 배열 만든 후 dog 인스턴스를 5개 생성하여 배열에 추가
 * 4. for문과 향상된 for문에서 dog클래스의 getter메소드를 이용하여 추가된 내용 출력
 * 
 * 
 * 힌트) 1. String도 클래스다, 클래스도 배열을 만들수 있다
 * 		2.클래스명 변수명=null; 변수명.출력메소드(); ▶  NullPointerException

 */
public class DogTest_question{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Dog[] dogs = new Dog[5]; //배열
		
		for(int i=0; i<dogs.length; i++) {
			Dog ins = new Dog();
			
			System.out.print("강아지 이름을 입력해주세요 : ");
			ins.setName(sc.next());
			System.out.print("강아지 종을 입력해주세요 : ");
			ins.setType(sc.next());
			
			dogs[i] = ins;
		}

		for(Dog index:dogs) { //dog의 길이만큼 반복
			System.out.print(index.getName()+" ");
			System.out.print(index.getType());
			System.out.println();
		}
		
		
	}
	
}