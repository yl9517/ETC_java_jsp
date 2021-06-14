package msa11;

import msa11.MemberDTO;

public class MemberPro {
	
	private MemberDTO[] arr = new MemberDTO[10];


	private int index = -1;
	//��ü �߰� �޼ҵ�
	public void memberAdd(String name,int kor, int eng) {
		arr[index++] = new MemberDTO(name, kor, eng);
	}
	
	//���ĸ޼ҵ�
	public void sort() {
		MemberDTO temp;
		for(int i=0; i<index-1; i++) {
			
		
			for(int j=i+1; j<index; j++) {
				
				if(arr[i].getTot()<arr[j].getTot()) {//���� �������� �ڸ� �ٲٱ�
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
	}
	public void print() {
		System.out.printf("�̸�\t ����\t ����\t ����\t ���\n");
		
		for(int i=0; i<index; i++) {
			MemberDTO dto = arr[i];
			System.out.printf("%s\t %d\t %d\t %d\t %.2f\n",dto.getName(),dto.getKor(),dto.getEng(),dto.getTot(),dto.getAvg());	
		}
		
}
}
