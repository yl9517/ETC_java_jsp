package msa11;

import msa11.MemberDTO;

public class MemberPro {
	
	private MemberDTO[] arr = new MemberDTO[10];


	private int index = -1;
	//객체 추가 메소드
	public void memberAdd(String name,int kor, int eng) {
		arr[index++] = new MemberDTO(name, kor, eng);
	}
	
	//정렬메소드
	public void sort() {
		MemberDTO temp;
		for(int i=0; i<index-1; i++) {
			
		
			for(int j=i+1; j<index; j++) {
				
				if(arr[i].getTot()<arr[j].getTot()) {//총점 기준으로 자리 바꾸기
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
	}
	public void print() {
		System.out.printf("이름\t 국어\t 영어\t 총점\t 평균\n");
		
		for(int i=0; i<index; i++) {
			MemberDTO dto = arr[i];
			System.out.printf("%s\t %d\t %d\t %d\t %.2f\n",dto.getName(),dto.getKor(),dto.getEng(),dto.getTot(),dto.getAvg());	
		}
		
}
}
