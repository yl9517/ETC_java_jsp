package msa07;
/* �޼ҵ� �����ε�(method overloading)
 *  - Ŭ���� ������ �̸��� ������ �Ű������� Ÿ��,����,������ �ٸ��� �ٸ� �޼ҵ�� �ν�
 * 
 * 
 */
public class Method {
	private String name;
	private int age;
	private String addr;
	private String phone;
	
	//name,age ���� �޼ҵ�
	public void	modify(String name, int age){
		this.name=name;
		this.age=age;
	}
	//name,addr ���� �޼ҵ�
	public void	modify(String name, String addr){ //�޼ҵ� �����ε�
		this.name=name;
		this.addr=addr;
	}
	
	public void print() {
		System.out.println(name+" "+age+" "+addr);
	}
	
	
	
	
	
}


