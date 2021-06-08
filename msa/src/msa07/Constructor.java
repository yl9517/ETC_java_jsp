package msa07;

//private : Ŭ���� ��������

public class Constructor {
	private long personId;
	private String name;
	private int age;
	private String phoneNo;
	private String address;
	
	
	//������
	//��Ŭ�� - source - constructor using fild - ���ϴ� ������ üũ - (public üũ Ȯ��) - generate
		//������ this�� ����X 
	
	public Constructor() {
		
	}
	//������ id,name,age
	public Constructor(long personId, String name,int age) {
		this(personId,name);
		this.age = age;
	}
	//������ id,name,age,add
	public Constructor(long personId, String name,int age,String address) {
		this(personId,name,age); //���� ���� �־��ֱ⵵ ����    ��    this(111,"lee",10)
		this.address = address;
	}
		
	//������ id,name
	public Constructor(long personId, String name) {
		this.personId = personId;
		this.name = name;
	}
	
	//������ id,name,phone,add
	public Constructor(long personId, String name,String phoneNo, String address) {
		this(personId,name);
		this.address=address;
		this.phoneNo=phoneNo;
	}
	
	
	//getter, setter 
	//�� : ��Ŭ�� - source - generate getter and setter - ���ϴ�get,set ���� - generate
	
	//id ����޼ҵ�
	public void setPersonId(long personId) {
		this.personId = personId;
	}
	//id ȣ�� �޼ҵ�
	public long getPersonId() {
		return personId;
	}
	
	//name
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	//age
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}

	//phone
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPhoneNo() {
		return phoneNo;
	}

	//address
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	

}
