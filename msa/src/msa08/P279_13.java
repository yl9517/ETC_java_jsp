package msa08;

class Member{
	private String name;
	private String id;
	private String password;
	private int age;
	
	public Member(String name,String id) {
		this.name=name;
		this.id=id;
	}
	
}
public class P279_13 {

	public static void main(String[] args) {
		Member m1 = new Member("ȫ�浿", "hong");
		Member m2 = new Member("���ڹ�", "java");
	}

}
