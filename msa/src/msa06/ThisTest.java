package msa06;


class Score{
	int jumsu =20;
	
	Score(int jumsu){
		jumsu+=jumsu;
		System.out.println(jumsu);
	}
}
public class ThisTest {

	public static void main(String[] args) {
		Score s1 = new Score(50);  //100

	}

}
