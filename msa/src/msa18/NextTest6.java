package msa18;

interface Hello{
	void sayHello();
}


public class NextTest6 {

	public static void main(String[] args) {

		Hello ins = new Hello() {
			
			@Override
			public void sayHello() {
				System.out.println("�ȳ��ϼ���");
			}
		};  //�͸�Ŭ����  anonymous class (�̸��� �Ⱥ�����)
		ins.sayHello();
		
		
				System.out.println("---------------");
		
		ins = new Hello() {
			
			@Override
			public void sayHello() {
				System.out.println("hello");
				
			}
		};
		ins.sayHello();
		
	}

}
