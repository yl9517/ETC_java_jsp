package msa15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class MapTest {

	public static void main(String[] args) {
		
		//HashMap
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		//put : �߰�
		hm.put("a1", 10);
		hm.put("a2", 20);
		hm.put("t1", 150);
		hm.put("a1", 400); //���� key�� value�� �ش� ������ �������
		hm.put("s1", 10);
		hm.put("a3", 50);
		
		
		//get : �ش� Ű�� ���� �� �޾ƿ���
		System.out.println(hm.get("a1")); //400
		System.out.println(hm.get("a2"));
		System.out.println(hm.get("a3"));
		System.out.println(hm.get("t1"));
		System.out.println(hm.get("a1"));
		System.out.println(hm.get("s1"));
		
				System.out.println("\n-------------");
		
				//set : ���� (�ߺ�x����x)
				Set<String> s = hm.keySet(); //Ű���� �̾Ƴ��� ���տ� ����	
				Iterator<String> it = s.iterator(); //���� ����
		
		//�� ���� ���� �ڵ�
		Iterator<String> ita =hm.keySet().iterator();
		
		while(ita.hasNext()) {
			String key = ita.next();
			int value = hm.get(key);
			System.out.println("key : "+key+"  |  value : "+value);
		}
	}

}
