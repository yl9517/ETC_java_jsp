package msa20;

public class p_ThreadTest {

	public static void main(String[] args) {

		ProductConsume a= new ProductConsume();
		p_ProductTh pro = new p_ProductTh(a);
		p_ConsumeTh con = new p_ConsumeTh(a);
		
		pro.start();
		con.start();

	}

}
