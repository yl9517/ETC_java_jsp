package t10_2;

import t10_1.Sample;

public class SampleTest extends Sample{
	
//	@Override
	public void prt() {   //부모클래스의 prt메소드는 같은 패키지 내에서만 볼 수 있는 것이므로 --  해당 클래스에서 prt() 부모 메소드를 볼 수 없음!!! 그러므로 오버라이딩x 새 메소드인것.
		System.out.println("hello");
	}

}
