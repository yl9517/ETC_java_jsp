package msa15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class MapTest {

	public static void main(String[] args) {
		
		//HashMap
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		//put : 추가
		hm.put("a1", 10);
		hm.put("a2", 20);
		hm.put("t1", 150);
		hm.put("a1", 400); //같은 key의 value가 해당 값으로 덮어씌워짐
		hm.put("s1", 10);
		hm.put("a3", 50);
		
		
		//get : 해당 키에 대한 값 받아오기
		System.out.println(hm.get("a1")); //400
		System.out.println(hm.get("a2"));
		System.out.println(hm.get("a3"));
		System.out.println(hm.get("t1"));
		System.out.println(hm.get("a1"));
		System.out.println(hm.get("s1"));
		
				System.out.println("\n-------------");
		
				//set : 집합 (중복x순서x)
				Set<String> s = hm.keySet(); //키들을 뽑아내서 집합에 넣음	
				Iterator<String> it = s.iterator(); //열거 해줌
		
		//더 보기 좋게 코드
		Iterator<String> ita =hm.keySet().iterator();
		
		while(ita.hasNext()) {
			String key = ita.next();
			int value = hm.get(key);
			System.out.println("key : "+key+"  |  value : "+value);
		}
	}

}
