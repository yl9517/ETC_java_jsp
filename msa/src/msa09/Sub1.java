package msa09;

public class Sub1 extends Super1{

	private String hakno;
	private String dept;
	
	public Sub1(String name,int age, String addr,String hakno,String dept) {
//		super(name,age,addr);
//		this.hakno=hakno;   //this(hakno,dept) 는 못씀 ▶ 첫번째 줄에만 올 수 있기 때문.(결국 super던 this던 하나밖에 못씀)
//		this.dept=dept;
		
		this(name, age,addr,hakno);
		this.dept=dept;
	}
	
	public Sub1(String name,int age, String addr,String hakno) {
		super(name,age,addr);
		this.dept=dept;
	}
	
	public Sub1(String hakno,String dept) {
		//super(); 포함되어있음
		this.hakno=hakno;
		this.dept=dept;
	}
	
	
}
