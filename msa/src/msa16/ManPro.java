package msa16;

import java.util.ArrayList;

public class ManPro {

	private ArrayList<Man> men = new ArrayList<>();

	//�߰�
	public void addMan(Man m) {
		men.add(m);

	}
	//�� ���
	public void printAll() {
		for(Man m:men) {
			System.out.println(m);
		}
		System.out.println("--------------\n");
	}
	
	//����
	public void removeMan(Man m) {
		for(int i=0; i<men.size(); i++) {
			Man item = men.get(i);
			if(m.getName().equals(item.getName()) && m.getAge()==item.getAge()) 
				men.remove(item);
			
		}
	}
	public void removeMan(String name) {
		for(int i=0; i<men.size(); i++) {
			Man item = men.get(i);
			if(name.equals(item.getName())) {
				men.remove(item); //������ ��� ����Ʈ�� �ϳ��� �մ�����Ƿ� �� ���� ���� i-- �ٽ� ���ڸ� ����
				i--;  //������ ���  i--;
			}
			
		}
	}


}
