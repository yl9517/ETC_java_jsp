package msa07;

public class ConstructorTest {
	public static void main(String[] args) {
		Constructor p1 = new Constructor();
		
		//p1.name="hong";   //name�� private�� ����x -> ����
		p1.setName("hong");  //����޼ҵ�� �� ����
		System.out.println(p1.getName());  //ȣ��޼ҵ� ȣ��
		
	}
}
