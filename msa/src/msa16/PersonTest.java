package msa16;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Person p = new Person("hong", 20);
		System.out.println(p);

		
		MemberArrayList ma = new MemberArrayList();
		
		//직접 넣기
		ma.addMember("hoei", 84);
		
		//객체 memarray로 객체 만들어서  addmember 메소드를 호출해서 자료 4개 입력
		ma.addMember(new Person("kim", 10));
		ma.addMember(new Person("lee", 20));
		ma.addMember(new Person("park", 30));
		ma.addMember(new Person("kim", 40));
		
		
		//객체 printAll 추가한 내용모두 출력
		ma.printAll();
		
		//kim이라는 자료만 보이도록 자료출력1
		 ma.print("kim");
		 
		 System.out.println("----------");
		 
		 
		 //kim이라는 자료들을 새 리스트에 담아 자료출력2

		
		 for(Person p1:ma.print("kim")) {
			 System.out.println(p1.getName()+", "+p1.getAge());
		}
		
		//삭제
		 boolean r = ma.removePerson(new Person("lee", 20));
		 if(r)
			 System.out.println("삭제 성공");
		 else
			 System.out.println("삭제 실패");
		 
		 //수정
		 r = ma.modifyPerson(new Person("kim", 10),new Person("kim2",100));
		 if(r)
			 System.out.println("수정 성공");
		 else
			 System.out.println("수정 실패");
	}
}
