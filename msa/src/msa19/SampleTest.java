package msa19;

import javax.swing.JButton;
import javax.swing.JFrame;

class Menu extends JFrame implements Runnable{

	@Override
	public void run() {
		System.out.println("������");
		
	}
	
	public Menu(String title) {
		JButton jbtn = new JButton("��ư");
		add(jbtn);
		setVisible(true);
		setSize(500,500);
		setLocation(400,400);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	
}
public class SampleTest {

	public static void main(String[] args) {
		new Menu("�޴�");

	}

}
