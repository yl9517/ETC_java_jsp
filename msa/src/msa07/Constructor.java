package msa07;

//private : 클래스 내에서만

public class Constructor {
	private long personId;
	private String name;
	private int age;
	private String phoneNo;
	private String address;
	
	
	//생성자
	//우클릭 - source - constructor using fild - 원하는 생성자 체크 - (public 체크 확인) - generate
		//생성자 this는 지원X 
	
	public Constructor() {
		
	}
	//생성자 id,name,age
	public Constructor(long personId, String name,int age) {
		this(personId,name);
		this.age = age;
	}
	//생성자 id,name,age,add
	public Constructor(long personId, String name,int age,String address) {
		this(personId,name,age); //직접 값을 넣어주기도 가능    ▶    this(111,"lee",10)
		this.address = address;
	}
		
	//생성자 id,name
	public Constructor(long personId, String name) {
		this.personId = personId;
		this.name = name;
	}
	
	//생성자 id,name,phone,add
	public Constructor(long personId, String name,String phoneNo, String address) {
		this(personId,name);
		this.address=address;
		this.phoneNo=phoneNo;
	}
	
	
	//getter, setter 
	//툴 : 우클릭 - source - generate getter and setter - 원하는get,set 선택 - generate
	
	//id 변경메소드
	public void setPersonId(long personId) {
		this.personId = personId;
	}
	//id 호출 메소드
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
