package msa17;


import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

class Person{
	private int no;
	private String name;
	private String jumin;
		
	public Person(int no, String name, String jumin) {
		this.no=no;
		this.name = name;
		this.jumin = jumin;
	}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJumin() {
		return jumin;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	@Override
	public String toString() {
		return no + "\t " + name + "\t " + jumin;
	}	
	
}

class PersonPro{
	Scanner sc = new Scanner(System.in);
	
	
	Hashtable<Integer, Person> people = new Hashtable<Integer, Person>();
	
	int i=1;	
	public String add(String name,String jumin) {
		String result = "해당 번호가 없습니다.";
		
		people.put(i, new Person(i, name, jumin));
		i++;
		result = "추가 완료";
		
		return result;
	}
	public String del(int index) {
		String result = "해당 번호가 없습니다.";
		
		if(foundNo(index)) {
			people.remove(index);
			result = "삭제 완료";
		}
		
		return result;
	}
	public String modify(int index) {
		String result = "해당 번호가 없습니다.";
		
		if(foundNo(index)) {
			System.out.print("1.이름 수정  | 2.주민번호 수정 >> ");
			int num = sc.nextInt();
			
			if(num==1) {
				System.out.print("수정 할 이름 : ");
				people.get(index).setName(sc.next());
				result = "수정 완료";
			}
			else if(num==2) {
				System.out.print("수정 할 이름 : ");
				people.get(index).setJumin(sc.next());
				result = "수정 완료";
			}
			
		}
		
		return result;
	}
	
	public void printAll() {
		

		System.out.println("번호\t 이름\t 주민번호");
		
		Enumeration<Person> ep = people.elements();
		
		while(ep.hasMoreElements()) {
			System.out.println(ep.nextElement());
		}
		

		
	}
	
	public boolean foundNo(int index) {
		boolean found = false;
		
		if(people.get(index) != null) 
			found = true;
			
		return found;
	}
	
	
}

public class HashTable_question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PersonPro pp = new PersonPro();
		int i=1;
		
		while(true) {
			System.out.println("\n-----------------------------");
			System.out.println("1.추가  | 2.삭제  | 3.수정  | 4.조회");
			int num = sc.nextInt();
			
			if(num==1) {
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("주민번호 : ");
				String jumin = sc.next();
				
				System.out.println(pp.add(name, jumin));
				
				//처리값은 boolean으로 받아와서 여기서 처리결과 출력하는게 더 좋음. 나중에 시간 되면 수정하기
				
			}
			else if(num==2) {
				System.out.print("삭제할 번호 : ");
				int index = sc.nextInt();
				
				System.out.println(pp.del(index));
				
			}
			else if(num==3) {
				System.out.print("수정할 번호 : ");
				int index = sc.nextInt();
				
				System.out.println(pp.modify(index));
				
			}
			else if(num==4) 
				pp.printAll();
		}

	}

}
