package msa20;

//bank = �����ڿ�
public class Bank {
	private String name;
	private int balance;
	
	public Bank(String name, int balance) {
		this.name=name;
		this.balance=balance;
	}
	
	//���
	public synchronized void widthDraw(int money) throws Exception{ //synchronized = ����ȭ
		if(balance<money)
			throw new Exception("�ܰ� ����"); //����ó��
		
		balance-=money;
		System.out.println("��� | �ܾ� : "+balance);
	}
	
	//�Ա�
	public synchronized void deposit(int money) {
		balance+=money;
		System.out.println("�Ա� | �ܾ� : "+balance);
	}
	
}
