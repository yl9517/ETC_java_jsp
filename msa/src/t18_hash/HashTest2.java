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
		hm.put(new Irum("ȫ", "�浿"), 20);
		hm.put(new Irum("��", "����"), 27);
		hm.put(new Irum("��", "����"), 29) ;
		hm.put(new Irum("��", "ä��"), 29);
		
		Irum ir = new Irum("��", "����");
		hm.put(ir,24);
		
//		int age = hm.get(new Irum("��","����"));  //���ο� ��ü�̹Ƿ� �� X, �׷��ٸ� ���� ��ü �� �̾Ƴ����Ѥ� �����?
		int age2 = hm.get(ir);
		
//		System.out.println(age);
		System.out.println(age2);
	}

}
