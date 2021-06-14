package t11;

import msa11.Flyable;
import msa11.Makable;

public class Interlmple1 implements Flyable,Makable{

	@Override
	public void prt() {
		System.out.println("prt method");
	}
	
	@Override
	public void make() {
		System.out.println("make method");
	}
	
}
