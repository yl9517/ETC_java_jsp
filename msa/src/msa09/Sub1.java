package msa09;

public class Sub1 extends Super1{

	private String hakno;
	private String dept;
	
	public Sub1(String name,int age, String addr,String hakno,String dept) {
//		super(name,age,addr);
//		this.hakno=hakno;   //this(hakno,dept) �� ���� �� ù��° �ٿ��� �� �� �ֱ� ����.(�ᱹ super�� this�� �ϳ��ۿ� ����)
//		this.dept=dept;
		
		this(name, age,addr,hakno);
		this.dept=dept;
	}
	
	public Sub1(String name,int age, String addr,String hakno) {
		super(name,age,addr);
		this.dept=dept;
	}
	
	public Sub1(String hakno,String dept) {
		//super(); ���ԵǾ�����
		this.hakno=hakno;
		this.dept=dept;
	}
	
	
}
