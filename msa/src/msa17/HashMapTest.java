package msa17;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		//추가
		hm.put("a1", 10);
		hm.put("a2", 20);
		hm.put("a3", 30);
		hm.put("a4", 40);
		
//		System.out.println(hm.keySet());
		
		Iterator<String> ita = hm.keySet().iterator(); //ketset : 저장된 key(집합)들을 반환   //[a1, a2, a3, a4]
		
		while(ita.hasNext()) {
			String key = ita.next();
			int value = hm.get(key); // get :맵의 키에 대한 값 반환 
			System.out.println(key+" "+value);			
		}

				System.out.println("-----------------------------------");
		
		//삭제
		int data = hm.remove("a3");
		System.out.println(data+"가 삭제됨!"); // data = "a3"에 대한 값
		
				System.out.println("-----------------------------------");
		
		ita = hm.keySet().iterator();
		while(ita.hasNext()) {
			String key = ita.next();
			int value = hm.get(key); // get :맵의 키에 대한 값 반환 
			System.out.println(key+" "+value);			
		}
		

				System.out.println("-----------------------------------");
				
		//똑같은 키값을 선언하면 덮어씌워짐.
		hm.put("a1", 100);
		
		ita = hm.keySet().iterator();
		while(ita.hasNext()) {
			String key = ita.next();
			int value = hm.get(key); // get :맵의 키에 대한 값 반환 
			System.out.println(key+" "+value);			
		}
	}

}
