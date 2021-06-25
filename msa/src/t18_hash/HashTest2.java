package t18_hash;

import java.util.HashMap;

class Irum{
	private String first;
	private String last;
	public Irum(String first, String last) {
		super();
		this.first = first;
		this.last = last;
	}
	@Override
	public String toString() {
		return "Irum [first=" + first + ", last=" + last + "]";
	}
	
	
	
}
public class HashTest2 {

	public static void main(String[] args) {
		HashMap<Irum, Integer> hm = new HashMap<Irum, Integer>();
		hm.put(new Irum("홍", "길동"), 20);
		hm.put(new Irum("김", "유진"), 27);
		hm.put(new Irum("김", "원겸"), 29) ;
		hm.put(new Irum("이", "채하"), 29);
		
		Irum ir = new Irum("이", "여름");
		hm.put(ir,24);
		
//		int age = hm.get(new Irum("김","유진"));  //새로운 객체이므로 값 X, 그렇다면 원래 객체 값 뽑아내느ㅡㄴ 방법은?
		int age2 = hm.get(ir);
		
//		System.out.println(age);
		System.out.println(age2);
	}

}
