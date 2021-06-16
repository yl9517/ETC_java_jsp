package msa13;

import java.util.Scanner;

/* 배열로 5개
 *  이름,이메일  => studentDTO 클래스
 * 	
 * 힌트 : @ (기준으로 split)
 * 
 * 결과
 * 이름	이메일(id@도메인)	id	도메인
 * 
 * 
 */
class Student{
	private String name;
	private String email;
	private String id;
	private String domain;	

	public Student(String name, String email, String id, String domain) {
		this.name = name;
		this.email = email;
		this.id = id;
		this.domain = domain;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getId() {
		return id;
	}

	public String getDomain() {
		return domain;
	}	
	
}

public class question {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student[] arr= new Student[5];

		for(int i=0; i<5; i++) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("이메일 : ");
			String email = sc.next();
			
			//메일 자르기
			String[] mail  = email.split("@"); 
			String id = mail[0];
			String domain = mail[1];
			
			arr[i] = new Student(name, email,id,domain); //인스턴스 추가
		}

		System.out.printf("%s\t %-25s\t %-10s\t %-10s","이름","이메일","아이디","도메인");
		System.out.println();
		for(Student index:arr) {
			System.out.printf("%s\t %-20s\t %-10s\t %-10s",index.getName(),index.getEmail(),index.getId(),index.getDomain());
			System.out.println();
		}

	}

}
