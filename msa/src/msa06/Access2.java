package msa06;
/*
 * ĸ��ȭ (private)
 * 
 */
public class Access2{
	
	private String name;
	
	public Access2(String name) {
		this.name=name;
	}
	
	
	//name���� ������ ���
	public void setName(String name){
		this.name=name;
	}
	//name ���� �������� ���
	public String getName() {
		return name;
	}
	
	public void prt() {
		System.out.println(name);
	}
	
}