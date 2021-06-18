package msa15;
/*
 * StudentDTO -학번,이름,나이 받기
 * UserArray - 자료추가/삭제/수정/출력/조회
 * 
 * 1.입력  2.수정 3.삭제 4.조회 5.전체보기 6.종료
 * 
 * 학번입력하세요
 * 기존학번이 있습니다
 * 이름을 입력하세요
 * 나이
 * 입력완료
 * 계속 입력할까요?
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class StudentDTO{
	private int no;
	private String name;
	private int age;
	
	public StudentDTO(int no, String name, int age) {
		this.no = no;
		this.name = name;
		this.age = age;
	}

	public int getno() {
		return no;
	}

	public void setno(int no) {
		this.no = no;
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
		return no + "\t " + name + "\t " + age;
	}

}

//UserArray - 자료추가/삭제/수정/출력/조회
class UserArray{
	Scanner sc =new Scanner(System.in);
	
	ArrayList<StudentDTO> students = new ArrayList<StudentDTO>();
		
	//추가
	public void add() {
		while(true) {			
			System.out.print(">> 학번 입력 : ");
			int no = sc.nextInt();
			
			if(no <1) {
				System.out.println("0 이하는 입력 할 수 없습니다.");
				break;
			}
			
			int findIndex = foundNo(no);	//중복학번 찾기
					
			if(findIndex==no)
				System.out.println("기존 학번이 있습니다.");	
			else {		
				System.out.print(">> 이름 입력 : ");
				String name =sc.next();
				System.out.print(">> 나이 입력 : ");
				int age = sc.nextInt();
				
				students.add(new StudentDTO(no, name, age)); //리스트에 추가
				System.out.println("입력 완료");
				
				System.out.print("> 계속 입력할까요?(y/n) :");
				String num = sc.next();
				if(num.equals("n"))
					break;
				
			}	
		}
		
	} //end add
	
	//수정
	public void modify() {
		while(true) {
			System.out.println(">> 수정할 학번 입력 : ");
			int findIndex = foundNo(sc.nextInt());
			
			if(findIndex == -1) { //같은학번 없음
				System.out.println("해당 학번이 없습니다.");
				break;
			}
			else { //같은 학번 있음
				System.out.println(">> 수정할 나이 입력 : ");
				students.get(findIndex).setAge(sc.nextInt());
				System.out.println("수정완료");
				
				System.out.print("> 계속 수정할까요?(y/n) :");
				String num = sc.next();
				if(num.equals("n"))
					break;
			}		
		}
	}	//end modify
	
	//삭제
	public void remove() {
		while(true) {
			System.out.println(">> 삭제할 학번 입력 : ");
			int findIndex = foundNo(sc.nextInt());
			
			if(findIndex == -1) { //같은학번 없음
				System.out.println("해당 학번이 없습니다.");
				break;
			}
			else { //같은 학번 있음
				students.remove(findIndex);
				System.out.println("삭제완료");
				
				System.out.print("> 계속 삭제할까요?(y/n) :");
				String num = sc.next();
				if(num.equals("n"))
					break;
			}		
		}
	}
	
	//조회
	public void view() {
		while(true) {
			System.out.println(">> 조회할 학번 입력 : ");
			int findIndex = foundNo(sc.nextInt());
			
			if(findIndex == -1) { //같은학번 없음
				System.out.println("해당 학번이 없습니다.");
				break;
			}
			else { //같은 학번 있음
				System.out.println("학번 :"+students.get(findIndex).getno());
				System.out.println("이름 :"+students.get(findIndex).getName());
				System.out.println("나이 :"+students.get(findIndex).getAge());
				
				System.out.print("> 계속 조회할까요?(y/n) :");
				String num = sc.next();
				if(num.equals("n"))
					break;
			}		
		}
	}
	public void allView() {
		while(true) {
			System.out.println("학번\t 이름\t 나이");
			
			Iterator<StudentDTO> ita = students.iterator();
			
			while(ita.hasNext()) {
				System.out.println(ita.next());
			}
			
			System.out.print("> 다시 보시겠습니까?(y/n) :");
			String num = sc.next();
			if(num.equals("n"))
				break;
		}
	}
	
	
	//학번찾기
	public int foundNo(int no) {
		
		int find = -1;
				
		for(int i=0; i<students.size(); i++) { //리스트 크기만큼 반복문
			if(students.get(i).getno()==no) {	//학번이 같다면
				find = i; //찾았으면 학번이 있는 인덱스 돌려주기
				break;
			}
		}
	
		return find;
	}
	
}

public class ArrayList_qestion {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		UserArray ua = new UserArray();
		
		while(true) {
		
			System.out.println("\n---------------------------[메뉴]---------------------------");
			System.out.println("1.입력   |  2.수정   |  3.삭제   |  4.조회   |  5.전체보기   | 6.종료 ");
			System.out.println("-------------------------------------------------------------");
			int num = sc.nextInt();
			
			switch(num) {
			
			case 1:
				ua.add();
				break;
			case 2:
				ua.modify();
				break;
			case 3:
				ua.remove();
				break;
			case 4:
				ua.view();
				break;
			case 5:
				ua.allView();
				break;
			case 6:
				System.out.println("종료 하시겠습니까?(예-y)");
				String result = sc.next();
				
				if(result.equals("y")) {
					System.out.println("종료 완료");
					System.exit(0);
				}
				else 
					continue;
			default :
				System.out.println("숫자를 잘못 입력하였습니다.");
			} //switch
		}
	}

}
