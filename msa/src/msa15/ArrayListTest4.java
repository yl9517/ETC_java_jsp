package msa15;


import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Person{
	private int pno;
	private String pname;
	
	public Person(int pno, String pname) {
		this.pno = pno;
		this.pname = pname;
	}
	
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	
}
public class ArrayListTest4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Person> arr= new ArrayList<>();


		
		while(true) {
			boolean overlap = false;
			
			System.out.print(">> ��ȣ �Է� : ");
			int pno = sc.nextInt();		//Person p= new Person();   p.setPno(sc.nectInt());    arr.add(p);
			
			
				for(Person item:arr) {
					if(item.getPno()==pno) {
						System.out.println("�ߺ��� ���� �ֽ��ϴ�.");	
						overlap=true;
					}
				}
			
	
			if(overlap==false) {
				System.out.print(">> �̸� �Է� : ");
				String pname = sc.next();
				
				arr.add(new Person(pno, pname));
				
				System.out.println("��� �Է��ұ��?");
				String ans = sc.next();
				
				if(ans.equals("n"))
					break;		
			}
		}
		
		for(Person item:arr)
			System.out.println(item.getPno() + " "+item.getPname());
		
	}
	
}
