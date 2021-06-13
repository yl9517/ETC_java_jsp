package msa09;

import java.util.ArrayList;

import com.kosta.vo.Person; //방법2 - 해당 패키지에 있는 것을 쓸것이다 선언
import com.kosta.vo.Man;
//유지보수 입장에서 com.kosata.vo*; 보다 각 클래스 이름을 쓰는것이 더 좋음


public class PersonTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		com.kosta.vo.Person p2 = new com.kosta.vo.Person(); //패키지명.클래스명 참조변수 = new .. //방법1 - 타 패키지에 있는 클래스  
		Person p3 = new Person(); //방법2
		
		
		ArrayList arr = new ArrayList();
		String name ="hong";
		Man ins = new Man();
		
	}

}
