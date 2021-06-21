package msa16;

import java.util.ArrayList;

public class ManPro {

	private ArrayList<Man> men = new ArrayList<>();

	//추가
	public void addMan(Man m) {
		men.add(m);

	}
	//다 출력
	public void printAll() {
		for(Man m:men) {
			System.out.println(m);
		}
		System.out.println("--------------\n");
	}
	
	//삭제
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
				men.remove(item); //삭제한 경우 리스트가 하나씩 앞당겨지므로 ▷ 다음 턴은 i-- 다시 제자리 돌기
				i--;  //삭제한 경우  i--;
			}
			
		}
	}


}
