package msa;
/*
 * Main���� ������ �迭�� �̿��� �������� ���α׷��� memberPro���� �ϵ��� ���α׷��� �����϶�.
 * 
 * ��Ʈ : main���� �ۼ��� �ҽ��� ���� ��ɺ��� �����Ͽ� �� �޼��带 ���� �����ϵ��� �Ѵ�.
 * dto : �ν��Ͻ�����, getter,setter ...
 * 
 * 
 * �ִ� 10�������� �ޱ�
 * [�Է�]
 * �̸�
 * ����
 * ����
 * ��� �Է�(0:break  1:����Է�)
 * 
 * [���] (�������� ������ ����)
 * �̸� ���� ���� ���� ���
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
	//��ü�� �߰��ϰ� �����ϰ� ����ϴ� ������ �޼ҵ带 ����
	
	//��� �� ��ü����
	public void add(String name,int kor,int eng) {
		//����,��հ�� 
		int tot = kor+eng;
		float avg = tot/2.0f;
		
		//�ش��ڸ� ���̸� ��ü ����
		for(int i=0; i<arr.length; i++) { //�迭 �ڸ���ŭ ����
			if(arr[i]==null) { //i��°�� ���̸� �� �ֱ�
				arr[i]= new MemberDTO(name, kor, eng, tot, avg); 
				break; //�� �־����� ����������
			}
		}
		
	}
	
	//��������
	public void sort() {
		
		MemberDTO temp;
		for(int i=0; i<arr.length-1; i++) {
			
			if(arr[i]==null)
				break; //i��°�� null�̸� ����������
		
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]==null)
					break; //j��°�� null�̸� ����������
				
				if(arr[i].getTot()<arr[j].getTot()) {//���� �������� �ڸ� �ٲٱ�
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		
	} //end sort method
	
	//�ΰ��ƴ� �� ���
	public void print() {
			System.out.printf("�̸�\t ����\t ����\t ����\t ���\n");
			
		for(MemberDTO i:arr) {
			if(i!=null) {
				System.out.printf("%s\t %d\t %d\t %d\t %.2f\n",i.getName(),i.getKor(),i.getEng(),i.getTot(),i.getAvg());
			}
				
		}
	}
	
}
public class question {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //main���� ��ü�� �Է��ϵ���
		//memberPro���� ������ �޼ҵ带 ȣ���Ͽ� ���
		
		MemberPro mp = new MemberPro();
		
		int i=0;
		while(i<10) {
			System.out.print("�̸� : ");
			String name = sc.next();
			System.out.print("���� : ");
			int kor = sc.nextInt();
			System.out.print("���� : ");
			int eng = sc.nextInt();
			
			mp.add(name, kor, eng);
			
			i++;
			if(i<10) {
				System.out.print("0 - �Է� ������ | 1 - ����Է� :");
				int num=sc.nextInt();
				
				if(num==0) //0������ break
					break;
			}
		}
		
		mp.sort(); //��������
		
		mp.print(); //���

	}

}
