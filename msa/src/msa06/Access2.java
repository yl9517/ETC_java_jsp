package msa06;
/*
 * 캡슐화 (private)
 * 
 */
public class Access2{
	
	private String name;
	
	public Access2(String name) {
		this.name=name;
	}
	
	
	//name값을 변경할 기능
	public void setName(String name){
		this.name=name;
	}
	//name 값을 가져오는 기능
	public String getName() {
		return name;
	}
	
	public void prt() {
		System.out.println(name);
	}
	
}