package msa16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MemberArrayList {
	private ArrayList<Person> arrperson = new ArrayList<Person>();
	
	//addMember 자료 추가하는 메소드
	public void addMember(String name,int age) {
		Person p = new Person(name,age);
		arrperson.add(p);
	}
	
	public void addMember(Person p) {
		arrperson.add(p);
	}
	
	//모두 출력
	public void printAll() {
		
//		for(int i=0; i<arrperson.size(); i++) {
//			System.out.println(arrperson.get(i).getName()+" "+arrperson.get(i).getAge());
//		}
		
		Iterator<Person> ita = arrperson.iterator();
		
		while(ita.hasNext()) {
			System.out.println(ita.next());
		}
		
	}
	
	//자료출력1
//	public void print(String name) {
//		for(Person p:arrperson) {
//			if(name.equals(p.getName()))
//				System.out.println(p.getName()+", "+p.getAge());
//		}
//	}
	
	
	//자료출력2
	public ArrayList<Person> print(String name){
		ArrayList<Person> p1 = new ArrayList<Person>();
		
		for(Person p:arrperson) {
			if(name.equals(p.getName()))
				p1.add(p);
		}
		return p1;
	}
	
	//삭제
	public boolean removePerson(Person ins) {
		
		//일반for
		for(int  i=0; i<arrperson.size(); i++) {		
			Person item = arrperson.get(i);
			
			if(ins.getName().equals(item.getName()) && ins.getAge()==item.getAge()) {
				arrperson.remove(i);
				return true;
			}
		}
		
		//향상for
//		for(Person item:arrperson) {
//			if(ins.getName().equals(item.getName()) && ins.getAge()==item.getAge()) {
//				arrperson.remove(item);
//				return true;
//			}
//		}
				
		return false;
		
	}
	public boolean modifyPerson(Person ins,Person ins2 ) {
		
		for(int  i=0; i<arrperson.size(); i++) {
			Person item = arrperson.get(i);
			if(ins.getName().equals(item.getName()) && ins.getAge()==item.getAge()) {
				arrperson.set(i,ins2);
				return true;
			}
		}
		return false;
	}
	
	
}
