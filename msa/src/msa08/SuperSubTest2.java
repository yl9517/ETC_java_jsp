package msa08;

class Phone{ //�θ�Ŭ����
	private String model; //�ܺο��� ���� �Ұ�
	private String color;
	
	public void call() {
		System.out.println("��ȭ�� �̴ϴ�.");
	}
	
	
	
}

class SmartPhone extends Phone{ //super1 Ŭ���� ��ӹ��� �ڽ�Ŭ����
	private String os;
	
	public void sendtMsg() {
		System.out.println("�޼����� �����ϴ�");
	}
	public void listenToMusic() {
		System.out.println("������ ����ϴ�.");
	}
	
}

public class SuperSubTest2 {

	public static void main(String[] args) {
		SmartPhone sp1 = new SmartPhone();
		sp1.sendtMsg();
		sp1.listenToMusic();
		sp1.call();
		
	}

}
