package msa13;

class Man implements Cloneable{
	private String name;
	private int age;
	
	public Man(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "name:"+name+", age:"+age;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException { //����Ŭ����,��ӹ��� ŸŬ����
		// TODO Auto-generated method stub
		return super.clone();
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
public class RefTest1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Man m1 = new Man("hong", 10);
		Man m2 = m1; //��������
		
		Man m = (Man)m1.clone(); //��������
		
		m2.setName("park");
		m2.setAge(30);
		
		System.out.println(m1);
		System.out.println(m2); //���� �ּҰ� ����Ű�Ƿ� �Ѵ� �ٲ�
		
		System.out.println(m); //������ �����صаű⶧���� �ȹٲ�
		
	}

}
