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
			
			System.out.print(">> 번호 입력 : ");
			int pno = sc.nextInt();		//Person p= new Person();   p.setPno(sc.nectInt());    arr.add(p);
			
			
				for(Person item:arr) {
					if(item.getPno()==pno) {
						System.out.println("중복된 값이 있습니다.");	
						overlap=true;
					}
				}
			
	
			if(overlap==false) {
				System.out.print(">> 이름 입력 : ");
				String pname = sc.next();
				
				arr.add(new Person(pno, pname));
				
				System.out.println("계속 입력할까요?");
				String ans = sc.next();
				
				if(ans.equals("n"))
					break;		
			}
		}
		
		for(Person item:arr)
			System.out.println(item.getPno() + " "+item.getPname());
		
	}
	
}
