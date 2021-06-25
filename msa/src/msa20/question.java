package msa20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


class MemberDTO{
	private String hakNo;
	private String name;
	private int age;
	
	public MemberDTO() {
		
	}
	
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
class MemberService{
	private List<MemberDTO> arr ;
	
	public MemberService() {
		arr= Collections.synchronizedList(new ArrayList<MemberDTO>());
		//collections = 동기화처리  (여러사람이 들어올 수 있도록)
	}
	
	//추가
	public boolean insert(MemberDTO md) throws q_DuplicateException {
		
		if(checkNo(md.getHakNo())) { //중복이 있으면
			throw new q_DuplicateException();
		}

		return arr.add(md);

	}
	//삭제
	public boolean delete(String hakNo) {
		for(MemberDTO sel:arr) {
			if(sel.getHakNo().equals(hakNo)) 
				return arr.remove(sel);
		}
		return false;
	}
	//수정
	public boolean modify(String hakNo,int age) {
		for(MemberDTO sel:arr) {
			if(sel.getHakNo().equals(hakNo)) {
				sel.setAge(age);
				return true;
			}
			
		}
		return false;
		
	}
	
	//개별 출력
	public MemberDTO selectPrint(String hakNo) throws q_NoDataException {
		
		for(MemberDTO sel:arr) {
			if(sel.getHakNo().equals(hakNo)) 
				return sel;
		}
		throw new q_NoDataException();
	}
	
	//전체출력
	public List<MemberDTO> allPrint() {
		return arr;
	}
	
	//학번체크
	public boolean checkNo(String hakNo) {
//		return list.contains(hakNo); //얘는 되나?
		for(MemberDTO index:arr) {
			if(index.getHakNo().equals(hakNo))
				return true;
		}
		return false;
	}
	
	
	
}
public class question {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberMenu mm = new MemberMenu(sc);
		
		while(true) {
			System.out.println("=====================[메인]========================");
			System.out.println("1.추가  | 2.삭제  | 3.수정  | 4.출력  | 5.전체출력  | 6.종료");
			System.out.println("==================================================");
	
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

			
		}//while
		
	}
}

class MemberMenu{
	private Scanner sc;
	MemberService service = new MemberService();
	
	public MemberMenu(Scanner sc) {
		this.sc=sc;
	}
	
	public void one() {
		while(true) {
			boolean result = false;
			
			System.out.println("------[입력]------");
			System.out.println("회원번호를 입력하시오");
			String hakNo = sc.next();
	
			if( service.checkNo(hakNo)) {	
				System.out.println("이미 존재하는 회원입니다.");
			}
			else {
				System.out.println("이름을 입력하시오");
				String name = sc.next();
				System.out.println("나이를 입력하시오");
				int age = sc.nextInt();
				
				try {
					result = service.insert(new MemberDTO(hakNo, name, age));
				}catch (q_DuplicateException  e) {
					System.out.println(e);
				}
				
				if(result)
					System.out.println("입력성공");
				else
					System.out.println("입력 실패");
			}
			
			System.out.println("계속 입력?");
			String yn = sc.next();	
	//		if("y".equalsIgnoreCase(yn)) //대소문자 무시하고 yn이 Y혹은 y라면
	//			one();	//제귀함수 recurisive call >> 좋지않은 프로그램, while이 더 좋음
			
			if("n".equalsIgnoreCase(yn))//대소문자 무시하고 yn이 N혹은 n라면
				break;
		} //while
	} //one
	
	//삭제
	public void two() {
		System.out.println("삭제할 회원번호 : ");
		String hakNo = sc.next();
		
		if(service.delete(hakNo)) 
			System.out.println("자료가 삭제 되었습니다.");
		else
			System.out.println("자료 삭제 실패");
	}
	
	//수정
	public void three() {
		System.out.println("수정할 회원번호 : ");
		String hakNo = sc.next();
		
		if(service.checkNo(hakNo)) {
			System.out.println("수정할 나이 :");
			int age = sc.nextInt();
			
			service.modify(hakNo, age);
		}
		else {
			System.out.println("자료 수정 실패");
		}
	}
	
	public void four() {
		while(true) {
			System.out.println("조회할 회원번호 : ");
			String hakNo = sc.next();
			try {
				MemberDTO dto = service.selectPrint(hakNo);
				System.out.println("회원번호 : "+dto.getHakNo());
				System.out.println("이름 : "+dto.getName());
				System.out.println("나이 : "+dto.getAge());
			}catch (Exception e) {
				System.out.println(e);
			}
			
			System.out.println("계속 입력?");
			String yn = sc.next();	
			if("n".equalsIgnoreCase(yn))//대소문자 무시하고 yn이 N혹은 n라면
				break;
		}
	}
	
	public void five() {
		//전체보기	
		List<MemberDTO> list = service.allPrint();
		System.out.println("학번\t 이름\t 나이");
		for(MemberDTO dto:list)
			System.out.println(dto);
	}
	
}