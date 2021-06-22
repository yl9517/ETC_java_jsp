package msa17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

//StudentDTO 학번(키값),이름,나이
//userMap 추가,삭제,수정,출력

// HashMap : 비동기 / HashTable : 동기 => 널값 허용X

class StudentDTO{
	private String hakNo;
	private String name;
	private int age;
	
	public StudentDTO(String hakNo, String name, int age) {
		super();
		this.hakNo = hakNo;
		this.name = name;
		this.age = age;
	}
	public String getHakNo() {
		return hakNo;
	}
	public void setHakNo(String hakNo) {
		this.hakNo = hakNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return hakNo + "\t " + name + "\t " + age;
	}
}

class UserMap{
	Scanner sc = new Scanner(System.in);
	HashMap<String, StudentDTO> list = new HashMap<String, StudentDTO>();
		
	//추가
	public void add() {
		
		System.out.print("학번 입력 :");
		String hakNo = sc.next();
		System.out.print("이름 입력 :");
		String name = sc.next();
		System.out.print("나이 입력 :");
		int age = sc.nextInt();
		
		//추가
		list.put(hakNo, new StudentDTO(hakNo, name, age));	
	}
	
	//삭제
	public void del() {
		System.out.println("학번 입력 :");		
		String hakNo = sc.next();
		
		if(findNo(hakNo)) {//학번찾았으면
			list.remove(hakNo);
			
			System.out.println("삭제완료");
		}else 
			System.out.println("학번이 없습니다.");		
		
	}
	
	//수정
	public void mod() {
		System.out.println("학번 입력 :");		
		String hakNo = sc.next();
		
		if(findNo(hakNo)) {//학번찾았으면
			System.out.print("수정할 나이 : ");
			list.get(hakNo).setAge(sc.nextInt());
			
			System.out.println("수정완료");
		}else 
			System.out.println("학번이 없습니다.");		
		
	}
	
	//출력
	public void printAll() {
		System.out.println("학번\t 이름\t 나이");
		Iterator<StudentDTO> ita = list.values().iterator();
		
		while(ita.hasNext()) {
			System.out.println(ita.next());
		}
		
	}
	
	//학번찾기
	public boolean findNo(String hakNo) {
		
		Iterator<String> ita = list.keySet().iterator();
		
		while(ita.hasNext()) {
			String key = ita.next();
			if(key.equals(hakNo)) {
				StudentDTO value = list.get(key);	
				return true;
			}
		}
		return false;

	}
}

public class HashMap_question {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		UserMap ua = new UserMap();
		while(true) {
			System.out.println("\n 1.추가 | 2.삭제 | 3.수정 | 4.전체조회");
			int num = sc.nextInt();
			
			switch(num) {
			
			case 1:
				ua.add();
				break;
			case 2:
				ua.del();
				break;
			case 3:
				ua.mod();
				break;
			case 4:
				ua.printAll();
				break;
			default :
				System.out.println("숫자를 잘못 입력하였습니다.");
			} //switch
		}
	}

}
