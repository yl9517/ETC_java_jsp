package msa19;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// 클래스 4개 - MemberDTO, MemberSerive(기능) , MemberTest(메인화면) , MemberMenu(서브화면)
//예외처리, if(age<0) throw new Exception
//학번,이름,나이 arraylist

class MemberDTO{
	private String hakNo;
	private String name;
	private int age;
	public MemberDTO(String hakNo, String name, int age) {
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

class MemberSerive{
	ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
	//추가
	public void insert(MemberDTO md){
		list.add(md);
	}
	//삭제
	public void del(int index) {
		list.remove(index);
	}
	
	//수정
	public void update(int index,int age) {
		list.get(index).setAge(age);
	}
	
	//개별출력
	public MemberDTO selectPrint(int index) {
		 return list.get(index);
				
	}
	
	//전체출력
	public ArrayList<MemberDTO> allPrint() {
		return list;
	}
	
	//학번찾기
	public int findNo(String hakNo) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getHakNo().equals(hakNo)) 
				return i;	
		}
		return -1;
	}
}

public class question {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MemberMenu mm = new MemberMenu();
		
		while(true) {
			System.out.println("=====================[메인]========================");
			System.out.println("1.추가  | 2.삭제  | 3.수정  | 4.출력  | 5.전체출력  | 6.종료");
			System.out.println("==================================================");
	
			try {
				System.out.print("선택 >> ");
				int num = sc.nextInt();
				
				switch(num) {
				case 1 :
					mm.one();
					break;
				case 2 :
					mm.two();	
					break;		
				case 3 :
					mm.three();		
					break;		
				case 4 :
					mm.four();	
					break;		
				case 5 :
					mm.five();
					break;
				case 6 :
					System.out.println("프로그램 종료");
					System.exit(0);
				default :
					System.out.println("번호를 잘못 입력하였습니다.");
				}
			}catch (Exception e) {
				 System.out.println("숫자를 입력해주세요");
			}
			
		}//while
		
	}
}

class MemberMenu{
	MemberSerive ms = new MemberSerive();
	Scanner sc = new Scanner(System.in);
	
	//추가
	public void one() {			
		System.out.print("학번 입력 : ");
		String hakNo = sc.next();
		
		int found = ms.findNo(hakNo); //중복검사
		
		if(found!=-1) { //학번 있음
			System.out.println("이미 존재하는 학번입니다.");
		}else { // 학번 없음
			System.out.print("이름 입력 : ");
			String name = sc.next();
			
			try {
				System.out.print("나이 입력 : ");
				int age = sc.nextInt();
				if (age<0)
					throw new Exception();				
				ms.insert(new MemberDTO(hakNo, name, age));

			}catch (Exception e) {
				System.out.println("나이를 다시 확인해주세요.");
				sc.nextLine(); //쓰레기값 버리기
			}
		}
		
	}
	
	//삭제
	public void two() {
		System.out.print("학번 입력 : ");
		String hakNo = sc.next();
		
		int found = ms.findNo(hakNo); //학번검사
		if(found!=-1) { //학번 있음
			ms.del(found);
		}else { // 학번 없음
			System.out.println("존재하지 않는 학번입니다.");
		}
		
	}
	
	//수정
	public void three() {
		System.out.print("학번 입력 : ");
		String hakNo = sc.next();
		
		int found = ms.findNo(hakNo); 
		
		if(found!=-1) { //학번 있음
			try {
				System.out.print("나이 입력 : ");
				int age = sc.nextInt();
				if (age<0)
					throw new Exception();				
				ms.update(found, age);
	
			}catch (Exception e) {
				System.out.println("나이를 다시 확인해주세요.");
				sc.nextLine(); //쓰레기값 버리기
			}
		}else { // 학번 없음
			System.out.println("존재하지 않는 학번입니다.");
		}
	}
	
	//개별출력
	public void four() {
		System.out.print("학번 입력 : ");
		String hakNo = sc.next();
		
		int found = ms.findNo(hakNo); 
		
		if(found!=-1) { //학번 있음			
			//출력
			System.out.println("학번\t 이름\t 나이");
			System.out.println(ms.selectPrint(found));
			
		}else { // 학번 없음
			System.out.println("존재하지 않는 학번입니다.");
		}
		
	}
	
	//전체출력
	public void five() {
		ArrayList<MemberDTO> members = ms.allPrint();
		System.out.println("학번\t 이름\t 나이");
		for(MemberDTO printAll:members)
			System.out.println(printAll);
	}
	
}
