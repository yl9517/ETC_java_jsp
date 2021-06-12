package msa;
/*
 * Main에서 구현한 배열을 이용한 성적관리 프로그램을 memberPro에서 하도록 프로그램을 변경하라.
 * 
 * 힌트 : main에서 작성된 소스를 보고 기능별로 구분하여 각 메서드를 만들어서 구분하도록 한다.
 * dto : 인스턴스변수, getter,setter ...
 * 
 * 
 * 최대 10개까지만 받기
 * [입력]
 * 이름
 * 국어
 * 영어
 * 계속 입력(0:break  1:계속입력)
 * 
 * [출력] (총점기준 내림차 정렬)
 * 이름 국어 영어 총점 평균
 * .. .. .. .. ..
 * 
 */

import java.util.Scanner;

class MemberDTO{
	private String name;
	private int kor;
	private int eng;
	private int tot;
	private float avg;
	
	public MemberDTO() {
		
	}
	public MemberDTO(String name,int kor,int eng, int tot, float avg) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.tot = tot;
		this.avg = avg;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}
	
	
	
}

class MemberPro{
	
	private MemberDTO[] arr = new MemberDTO[10];
	//객체를 추가하고 정렬하고 출력하는 각각의 메소드를 구현
	
	//계산 및 객체생성
	public void add(String name,int kor,int eng) {
		//총점,평균계산 
		int tot = kor+eng;
		float avg = tot/2.0f;
		
		//해당자리 널이면 객체 생성
		for(int i=0; i<arr.length; i++) { //배열 자리만큼 돌고
			if(arr[i]==null) { //i번째가 널이면 값 넣기
				arr[i]= new MemberDTO(name, kor, eng, tot, avg); 
				break; //값 넣었으면 빠져나오기
			}
		}
		
	}
	
	//내림차순
	public void sort() {
		
		MemberDTO temp;
		for(int i=0; i<arr.length-1; i++) {
			
			if(arr[i]==null)
				break; //i번째가 null이면 빠져나오기
		
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]==null)
					break; //j번째가 null이면 빠져나오기
				
				if(arr[i].getTot()<arr[j].getTot()) {//총점 기준으로 자리 바꾸기
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		
	} //end sort method
	
	//널값아닐 시 출력
	public void print() {
			System.out.printf("이름\t 국어\t 영어\t 총점\t 평균\n");
			
		for(MemberDTO i:arr) {
			if(i!=null) {
				System.out.printf("%s\t %d\t %d\t %d\t %.2f\n",i.getName(),i.getKor(),i.getEng(),i.getTot(),i.getAvg());
			}
				
		}
	}
	
}
public class question {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //main에서 객체를 입력하도록
		//memberPro에서 구현한 메소드를 호출하여 출력
		
		MemberPro mp = new MemberPro();
		
		int i=0;
		while(i<10) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("국어 : ");
			int kor = sc.nextInt();
			System.out.print("영어 : ");
			int eng = sc.nextInt();
			
			mp.add(name, kor, eng);
			
			i++;
			if(i<10) {
				System.out.print("0 - 입력 끝내기 | 1 - 계속입력 :");
				int num=sc.nextInt();
				
				if(num==0) //0누르면 break
					break;
			}
		}
		
		mp.sort(); //내림차순
		
		mp.print(); //출력

	}

}
