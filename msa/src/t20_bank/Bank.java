package t20_bank;

//bank = �����ڿ�
class Bank {
	private String name;
	private int balance;
	
	public Bank(String name, int balance) {
		this.name=name;
		this.balance=balance;
	}
	
	//���
	public void widthDraw(int money) throws Exception{ //synchronized = ����ȭ
		if(balance<money)
			throw new Exception("�ܰ� ����"); //����ó��
		
		balance-=money;
		System.out.println("��� | �ܾ� : "+balance);
	}
	//�Ա�
	public void deposit(int money) {
		balance+=money;
		System.out.println("�Ա� | �ܾ� : "+balance);
	}
	
}
